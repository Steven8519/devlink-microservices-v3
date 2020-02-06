package info.devlink.core.recruiterservice.services;

import info.devlink.core.api.core.recruiter.Recruiter;
import info.devlink.core.recruiterservice.persistence.RecruiterEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-05T20:15:46-0600",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class RecruiterMapperImpl implements RecruiterMapper {

    @Override
    public Recruiter entityToApi(RecruiterEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Recruiter recruiter = new Recruiter();

        return recruiter;
    }

    @Override
    public RecruiterEntity apiToEntity(Recruiter api) {
        if ( api == null ) {
            return null;
        }

        RecruiterEntity recruiterEntity = new RecruiterEntity();

        recruiterEntity.setName( api.getRecruiterName() );
        recruiterEntity.setRecruiterId( api.getRecruiterId() );
        recruiterEntity.setDeveloperId( api.getDeveloperId() );
        recruiterEntity.setCompanyWorkFor( api.getCompanyWorkFor() );
        recruiterEntity.setServiceAddress( api.getServiceAddress() );

        return recruiterEntity;
    }

    @Override
    public List<Recruiter> entityListToApiList(List<RecruiterEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Recruiter> list = new ArrayList<Recruiter>( entity.size() );
        for ( RecruiterEntity recruiterEntity : entity ) {
            list.add( entityToApi( recruiterEntity ) );
        }

        return list;
    }

    @Override
    public List<RecruiterEntity> apiListToEntityList(List<Recruiter> api) {
        if ( api == null ) {
            return null;
        }

        List<RecruiterEntity> list = new ArrayList<RecruiterEntity>( api.size() );
        for ( Recruiter recruiter : api ) {
            list.add( apiToEntity( recruiter ) );
        }

        return list;
    }
}
