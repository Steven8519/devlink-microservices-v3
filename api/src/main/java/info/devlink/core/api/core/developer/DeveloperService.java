package info.devlink.core.api.core.developer;

import org.springframework.web.bind.annotation.*;

public interface DeveloperService {

    /**
     * Sample usage:
     *
     * curl -X POST $HOST:$PORT/developer \
     *
     * @param body
     * @return
     */
    @PostMapping(
            value    = "/developer",
            consumes = "application/json",
            produces = "application/json")
    Developer createDeveloper(@RequestBody Developer body);

    /**
     * Sample usage: curl $HOST:$PORT/product/1
     *
     * @param developerId
     * @return the developer, if found, else null
     */
    @GetMapping(
            value    = "/developer/{developerId}",
            produces = "application/json")
    Developer getDeveloper(@PathVariable int developerId);

    /**
     * Sample usage:
     *
     * curl -X DELETE $HOST:$PORT/developer/1
     *
     * @param developerId
     */
    @DeleteMapping(value = "/developer/{developerId}")
    void deleteDeveloper(@PathVariable int developerId);
}
