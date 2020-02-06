package info.devlink.core.contactservice.services;

import info.devlink.core.api.core.contact.Contact;
import info.devlink.core.contactservice.persistence.ContactEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-06T12:54:19-0600",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public Contact entityToApi(ContactEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setDeveloperId( entity.getDeveloperId() );
        contact.setRecruiterId( entity.getRecruiterId() );
        contact.setContactId( entity.getContactId() );
        contact.setEmail( entity.getEmail() );
        contact.setPhoneNumber( entity.getPhoneNumber() );

        return contact;
    }

    @Override
    public ContactEntity apiToEntity(Contact api) {
        if ( api == null ) {
            return null;
        }

        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setDeveloperId( api.getDeveloperId() );
        contactEntity.setRecruiterId( api.getRecruiterId() );
        contactEntity.setContactId( api.getContactId() );
        contactEntity.setEmail( api.getEmail() );
        contactEntity.setPhoneNumber( api.getPhoneNumber() );
        contactEntity.setServiceAddress( api.getServiceAddress() );

        return contactEntity;
    }

    @Override
    public List<Contact> entityListToApiList(List<ContactEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Contact> list = new ArrayList<Contact>( entity.size() );
        for ( ContactEntity contactEntity : entity ) {
            list.add( entityToApi( contactEntity ) );
        }

        return list;
    }

    @Override
    public List<ContactEntity> apiListToEntityList(List<Contact> api) {
        if ( api == null ) {
            return null;
        }

        List<ContactEntity> list = new ArrayList<ContactEntity>( api.size() );
        for ( Contact contact : api ) {
            list.add( apiToEntity( contact ) );
        }

        return list;
    }
}
