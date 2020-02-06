package info.devlink.core.api.core.contact;

public class Contact {
    private final int developerId;
    private final int recruiterId;
    private final int contactId;
    private final String email;
    private final String phoneNumber;
    private final String serviceAddress;

    public Contact() {
        developerId = 0;
        recruiterId = 0;
        contactId = 0;
        email = null;
        phoneNumber = null;
        serviceAddress = null;
    }

    public Contact(int developerId, int recruiterId, int contactId, String email, String phoneNumber, String serviceAddress) {
        this.developerId = developerId;
        this.recruiterId = recruiterId;
        this.contactId = contactId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.serviceAddress = serviceAddress;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public int getRecruiterId() {
        return recruiterId;
    }

    public int getContactId() {
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
