package info.devlink.core.api.composite.developer;

import java.util.List;

public class DeveloperAggregate {
    private final String developerId;
    private final String name;
    private final List<RecruiterSummary> recruiters;
    private final List<ContactSummary> contacts;
    private final ServiceAddress serviceAddress;

    public DeveloperAggregate(String developerId, String name, List<RecruiterSummary> recruiters, List<ContactSummary> contacts, ServiceAddress serviceAddress) {
        this.developerId = developerId;
        this.name = name;
        this.recruiters = recruiters;
        this.contacts = contacts;
        this.serviceAddress = serviceAddress;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public String getName() {
        return name;
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
