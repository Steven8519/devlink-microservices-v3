package info.devlink.core.api.composite.developer;

public class ServiceAddress {
    private final String compositeAddress;
    private final String developerAddress;
    private final String contactAddress;
    private final String recruiterAddress;


    public ServiceAddress() {
        compositeAddress = null;
        developerAddress = null;
        contactAddress = null;
        recruiterAddress = null;
    }

    public ServiceAddress(String compositeAddress, String developerAddress, String contactAddress, String recruiterAddress) {
        this.compositeAddress = compositeAddress;
        this.developerAddress = developerAddress;
        this.contactAddress = contactAddress;
        this.recruiterAddress = recruiterAddress;
    }

    public String getCompositeAddress() {
        return compositeAddress;
    }

    public String getDeveloperAddress() {
        return developerAddress;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getRecruiterAddress() {
        return recruiterAddress;
    }
}
