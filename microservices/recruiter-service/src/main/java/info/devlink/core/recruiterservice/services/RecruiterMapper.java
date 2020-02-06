package info.devlink.core.recruiterservice.services;

import info.devlink.core.api.core.recruiter.Recruiter;
import info.devlink.core.recruiterservice.persistence.RecruiterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecruiterMapper {
    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true)
    })
    Recruiter entityToApi(RecruiterEntity entity);

    @Mappings({
            @Mapping(target = "name", source="api.recruiterName"),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "version", ignore = true)
    })
    RecruiterEntity apiToEntity(Recruiter api);

    List<Recruiter> entityListToApiList(List<RecruiterEntity> entity);
    List<RecruiterEntity> apiListToEntityList(List<Recruiter> api);
}
