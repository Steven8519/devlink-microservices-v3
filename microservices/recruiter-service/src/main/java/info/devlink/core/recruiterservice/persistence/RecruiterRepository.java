package info.devlink.core.recruiterservice.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends CrudRepository<RecruiterEntity, String> {
}
