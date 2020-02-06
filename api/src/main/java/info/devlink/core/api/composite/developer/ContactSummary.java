package info.devlink.core.api.composite.developer;

public class ContactSummary {

    private final int contactId;
    private final String email;
    private final String phoneNumber;

    public ContactSummary() {
        contactId = 0;
        email = null;
        phoneNumber = null;
    }

    public ContactSummary(int contactId, String email, String phoneNumber) {
        this.contactId = contactId;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getContactId() {
        return contactId;
    }

}
