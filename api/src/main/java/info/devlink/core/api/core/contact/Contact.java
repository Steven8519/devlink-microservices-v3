package info.devlink.core.api.core.contact;

public class Contact {
    private final String developerId;
    private final String contactId;
    private final String email;
    private final String phoneNumber;
    private final String serviceAddress;

    public Contact() {
        developerId = null;
        contactId = null;
        email = null;
        phoneNumber = null;
        serviceAddress = null;
    }

    public Contact(String developerId, String contactId, String email, String phoneNumber, String serviceAddress) {
        this.developerId = developerId;
        this.contactId = contactId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.serviceAddress = serviceAddress;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public String getContactId() {
        return contactId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
