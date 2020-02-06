package info.devlink.core.contactservice.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {

    @Transactional(readOnly = true)
    List<ContactEntity> findByDeveloperId(int developerId);

}
