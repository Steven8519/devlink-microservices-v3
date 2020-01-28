package info.devlink.core.api.composite.developer;

import java.util.List;

public class DeveloperAggregate {

    private final int developerId;
    private final List<RecruiterSummary> recruiters;
    private final List<ContactSummary> contacts;
    private final ServiceAddress serviceAddress;

    public DeveloperAggregate(int developerId, List<RecruiterSummary> recruiters, List<ContactSummary> contacts, ServiceAddress serviceAddress) {
        this.developerId = developerId;
        this.recruiters = recruiters;
        this.contacts = contacts;
        this.serviceAddress = serviceAddress;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public List<RecruiterSummary> getRecruiters() {
        return recruiters;
    }

    public List<ContactSummary> getContacts() {
        return contacts;
    }

    public ServiceAddress getServiceAddress() {
        return serviceAddress;
    }







}
