package info.devlink.core.contactservice.services;

import info.devlink.core.api.core.contact.Contact;
import info.devlink.core.api.core.contact.ContactService;
import info.devlink.core.contactservice.persistence.ContactEntity;
import info.devlink.core.contactservice.persistence.ContactRepository;
import info.devlink.core.util.exceptions.InvalidInputException;
import info.devlink.core.util.http.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;

@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private static final Logger LOG = LoggerFactory.getLogger(ContactServiceImpl.class);

    private final ContactRepository repository;

    private final ContactMapper mapper;

    private final ServiceUtil serviceUtil;

    @Override
    public Contact createContact(Contact body) {
        try {
            ContactEntity entity = mapper.apiToEntity(body);
            ContactEntity newEntity = repository.save(entity);

            LOG.debug("createContact: created a contact entity: {}/{}", body.getDeveloperId(), body.getContactId());
            return mapper.entityToApi(newEntity);

        } catch (DataIntegrityViolationException dive) {
            throw new InvalidInputException("Duplicate key, Developer Id: " + body.getDeveloperId() + ", Contact Id:" + body.getContactId());
        }
    }

    @Override
    public List<Contact> getContacts(int developerId) {
        if (developerId < 1) throw new InvalidInputException("Invalid developerId: " + developerId);

        List<ContactEntity> entityList = repository.findByDeveloperId(developerId);
        List<Contact> list = mapper.entityListToApiList(entityList);
        list.forEach(e -> e.setServiceAddress(serviceUtil.getServiceAddress()));

        LOG.debug("getContacts: response size: {}", list.size());

        return list;
    }

    @Override
    public void deleteContacts(int contactId) {

    }
}
