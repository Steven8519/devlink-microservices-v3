package info.devlink.core.api.core.contact;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ContactService {

    /**
     * Sample usage:
     *
     *
     * @param body
     * @return
     */
    @PostMapping(
            value    = "/contact",
            consumes = "application/json",
            produces = "application/json")
    Contact createContact(@RequestBody Contact body);

    /**
     * Sample usage: curl $HOST:$PORT/contact?contactId=1
     *
     * @param contactId
     * @return
     */
    @GetMapping(
            value    = "/contact",
            produces = "application/json")
    List<Contact> getContacts(@RequestParam(value = "contactId", required = true) int contactId);

    /**
     * Sample usage:
     *
     * curl -X DELETE $HOST:$PORT/contact?contactId=1
     *
     * @param contactId
     */
    @DeleteMapping(value = "/contact")
    void deleteContacts(@RequestParam(value = "contactId", required = true)  int contactId);
}
