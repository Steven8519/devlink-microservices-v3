package info.devlink.core.developerservice.services;

import info.devlink.core.developerservice.persistence.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.developer.DeveloperService;
import info.devlink.core.util.http.ServiceUtil;
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
        return null;
    }

    @Override
    public Developer getDeveloper(int developerId) {
        return new Developer(developerId, "Mike", "Turner", "Software Engineer", 2, serviceUtil.getServiceAddress());
    }

    @Override
    public void deleteDeveloper(int developerId) {

    }
}
