package info.devlink.core.api.composite.developer;

import java.util.List;

public class DeveloperAggregate {

    private final int developerId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final List<RecruiterSummary> recruiters;
    private final List<ContactSummary> contacts;
    private final ServiceAddress serviceAddress;

    public DeveloperAggregate() {
        developerId = 0;
        firstName = null;
        lastName = null;
        jobTitle = null;
        recruiters = null;
        contacts = null;
        serviceAddress = null;
    }

    public DeveloperAggregate(int developerId, String firstName, String lastName, String jobTitle,
                              List<RecruiterSummary> recruiters, List<ContactSummary> contacts, ServiceAddress serviceAddress) {
        this.developerId = developerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.recruiters = recruiters;
        this.contacts = contacts;
        this.serviceAddress = serviceAddress;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
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
