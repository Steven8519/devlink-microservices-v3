package info.devlink.core.api.composite.developer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeveloperCompositeService {

    /**
     * Sample usage: curl $HOST:$PORT/developer-composite/1
     *
     * @param developerId
     * @return the composite product info, if found, else null
     */
    @GetMapping(
            value    = "/developer-composite/{developerId}",
            produces = "application/json")
    DeveloperAggregate getProduct(@PathVariable int developerId);
}
