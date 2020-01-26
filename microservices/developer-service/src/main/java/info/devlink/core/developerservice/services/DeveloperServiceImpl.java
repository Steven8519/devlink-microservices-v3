package info.devlink.core.developerservice.services;

import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.developer.DeveloperService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperServiceImpl implements DeveloperService {


    @Override
    public Developer getDeveloper(int developerId) {
        return null;
    }
}
