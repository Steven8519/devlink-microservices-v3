package info.devlink.core.developerservice.services;

import info.devlink.core.developerservice.persistence.DeveloperEntity;
import info.devlink.core.developerservice.persistence.DeveloperRepository;
import info.devlink.core.util.exceptions.InvalidInputException;
import info.devlink.core.util.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.developer.DeveloperService;
import info.devlink.core.util.http.ServiceUtil;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeveloperServiceImpl implements DeveloperService {

    private static final Logger LOG = LoggerFactory.getLogger(DeveloperServiceImpl.class);

    private final ServiceUtil serviceUtil;

    private final DeveloperRepository developerRepository;

    private final DeveloperMapper developerMapper;

    @Override
    public Developer createDeveloper(Developer body) {

        try {
            DeveloperEntity entity = developerMapper.apiToEntity(body);
            DeveloperEntity newEntity = developerRepository.save(entity);

            LOG.debug("createProduct: entity created for developerId: {}", body.getDeveloperId());
            return developerMapper.entityToApi(newEntity);

        } catch (DuplicateKeyException dke) {
            throw new InvalidInputException("Duplicate key,  Id: " + body.getDeveloperId());
        }
    }

    @Override
    public Developer getDeveloper(int developerId) {
        if (developerId < 1) throw new InvalidInputException("Invalid developerId: " + developerId);

        DeveloperEntity entity = developerRepository.findByDeveloperId(developerId)
                .orElseThrow(() -> new NotFoundException("No developer found for developerId: " + developerId));

        Developer response = developerMapper.entityToApi(entity);
        response.setServiceAddress(serviceUtil.getServiceAddress());

        LOG.debug("getDeveloper: found developerId: {}", response.getDeveloperId());

        return response;
    }

    @Override
    public void deleteDeveloper(int developerId) {
        LOG.debug("deleteProduct: tries to delete an entity with productId: {}", developerId);
        developerRepository.findByDeveloperId(developerId).ifPresent(e -> developerRepository.delete(e));
    }
}
