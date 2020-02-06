package info.devlink.core.developerservice.services;

import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.developerservice.persistence.DeveloperEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-06T11:19:29-0600",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class DeveloperMapperImpl implements DeveloperMapper {

    @Override
    public Developer entityToApi(DeveloperEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Developer developer = new Developer();

        return developer;
    }

    @Override
    public DeveloperEntity apiToEntity(Developer api) {
        if ( api == null ) {
            return null;
        }

        DeveloperEntity developerEntity = new DeveloperEntity();

        developerEntity.setDeveloperId( api.getDeveloperId() );
        developerEntity.setFirstName( api.getFirstName() );
        developerEntity.setLastName( api.getLastName() );
        developerEntity.setJobTitle( api.getJobTitle() );
        developerEntity.setCompanyNumber( api.getCompanyNumber() );
        developerEntity.setServiceAddress( api.getServiceAddress() );

        return developerEntity;
    }
}
