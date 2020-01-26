package info.devlink.core.api.composite.developer;

import info.devlink.core.api.core.developer.Developer;

public class ContactSummary {

    private final String contactId;
    private final Developer developer;

    public ContactSummary() {
        contactId = null;
        developer = null;
    }

    public ContactSummary(String contactId, Developer developer) {
        this.contactId = contactId;
        this.developer = developer;
    }

    public String getContactId() {
        return contactId;
    }

    public Developer getDeveloper() {
        return developer;
    }
}
