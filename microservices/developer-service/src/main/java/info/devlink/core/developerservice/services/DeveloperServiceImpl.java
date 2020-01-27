package info.devlink.core.developerservice.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.developer.DeveloperService;
import info.devlink.core.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperServiceImpl implements DeveloperService {

    private static final Logger LOG = LoggerFactory.getLogger(DeveloperServiceImpl.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public DeveloperServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    @Override
    public Developer getDeveloper(int developerId) {
        return new Developer(developerId, "Mike", "Turner", "Software Engineer", 2, serviceUtil.getServiceAddress());
    }
}
