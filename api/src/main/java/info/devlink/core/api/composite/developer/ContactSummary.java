package info.devlink.core.api.composite.developer;

public class ContactSummary {

    private final int contactId;
    private final String info;

    public ContactSummary() {
        contactId = 0;
        info = null;
    }

    public ContactSummary(int contactId, String info) {
        this.contactId = contactId;
        this.info = info;
    }

    public int getContactId() {
        return contactId;
    }

    public String  getInfo() {
        return info;
    }
}
