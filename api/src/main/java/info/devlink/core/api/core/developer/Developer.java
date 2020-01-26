package info.devlink.core.api.core.developer;

public class Developer {
    private final String developerId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final String serviceAddress;

    public Developer(int developerId, String s, int i, String serviceAddress) {
        this.developerId = null;
        firstName = null;
        lastName = null;
        jobTitle = null;
        this.serviceAddress = null;
    }

    public Developer(String developerId, String firstName, String lastName, String jobTitle, String serviceAddress) {
        this.developerId = developerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.serviceAddress = serviceAddress;
    }

    public String getDeveloperId() {
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

    public String getServiceAddress() {
        return serviceAddress;
    }
}
