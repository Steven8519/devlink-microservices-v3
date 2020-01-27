package info.devlink.core.api.core.developer;

public class Developer {
    private final int developerId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final int companyNumber;
    private final String serviceAddress;

    public Developer() {
        developerId = 0;
        firstName = null;
        lastName = null;
        jobTitle = null;
        companyNumber = 0;
        serviceAddress = null;
    }

    public Developer(int developerId, String firstName, String lastName, String jobTitle, int companyNumber, String serviceAddress) {
        this.developerId = developerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.companyNumber = companyNumber;
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

    public int getCompanyNumber() {
        return companyNumber;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
