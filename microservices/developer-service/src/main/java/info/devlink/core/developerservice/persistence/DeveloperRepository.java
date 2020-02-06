package info.devlink.core.developerservice.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeveloperRepository extends PagingAndSortingRepository<DeveloperEntity, String > {
}
