package info.devlink.core.api.core.developer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeveloperService {

    /**
     * Sample usage: curl $HOST:$PORT/product/1
     *
     * @param developerId
     * @return the product, if found, else null
     */
    @GetMapping(
            value    = "/developer/{developerId}",
            produces = "application/json")
    Developer getDeveloper(@PathVariable int developerId);
}
