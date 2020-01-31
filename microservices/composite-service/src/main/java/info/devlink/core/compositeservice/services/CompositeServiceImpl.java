package info.devlink.core.compositeservice.services;

import info.devlink.core.api.composite.developer.*;
import info.devlink.core.api.core.contact.Contact;
import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.recruiter.Recruiter;
import info.devlink.core.util.exceptions.NotFoundException;
import info.devlink.core.util.http.ServiceUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CompositeServiceImpl implements DeveloperCompositeService {

    private final ServiceUtil serviceUtil;
    private  CompositeIntegration integration;

    @Autowired
    public CompositeServiceImpl(ServiceUtil serviceUtil, CompositeIntegration integration) {
        this.serviceUtil = serviceUtil;
        this.integration = integration;
    }

    @ApiOperation(value = "${api.developer-composite.get-composite-developer.info}", notes = "${api.product-composite.get-composite-product.notes}")
    @Override
    public DeveloperAggregate getDeveloper(int developerId) {
        Developer developer = integration.getDeveloper(developerId);
        if (developer == null) throw new NotFoundException("No developer found for productId: " + developerId);

        List<Recruiter> recruiters = integration.getRecruiters(developerId);

        List<Contact> contacts = integration.getContacts(developerId);

        return createDeveloperAggregate(developer, recruiters, contacts, serviceUtil.getServiceAddress());
    }

    private DeveloperAggregate createDeveloperAggregate(Developer developer, List<Recruiter> recruiters, List<Contact> contacts, String serviceAddress) {

        int developerId = developer.getDeveloperId();

        List<RecruiterSummary> recruiterSummaries = (recruiters == null) ? null :
                recruiters.stream()
                        .map(r -> new RecruiterSummary(r.getRecruiterId(), r.getRecruiterName()))
                        .collect(Collectors.toList());

        List<ContactSummary> contactSummaries = (contacts == null)  ? null :
                contacts.stream()
                        .map(contact -> new ContactSummary(contact.getContactId(), contact.getEmail()))
                        .collect(Collectors.toList());

        // 4. Create info regarding the involved microservices addresses
        String developerAddress = developer.getServiceAddress();
        String contactAddress = (contacts != null && contacts.size() > 0) ? contacts.get(0).getServiceAddress() : "";
        String recruiterAddress = (recruiters != null && recruiters.size() > 0) ? recruiters.get(0).getServiceAddress() : "";
        ServiceAddress serviceAddresses = new ServiceAddress(serviceAddress, developerAddress, contactAddress, recruiterAddress);

        return new DeveloperAggregate(developerId, recruiterSummaries, contactSummaries, serviceAddresses);
    }
}
