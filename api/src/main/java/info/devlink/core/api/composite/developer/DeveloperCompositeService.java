package info.devlink.core.api.composite.developer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Api
public interface DeveloperCompositeService {

    /**
     * Sample usage: curl $HOST:$PORT/developer-composite/1
     *
     * @param developerId
     * @return the composite developer info, if found, else null
     */
    @ApiOperation(
            value = "${api.developer-composite.get-composite-developer.developer}",
            notes = "${api.product-composite.get-composite-product.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request, invalid format of the request. See response message for more information."),
            @ApiResponse(code = 404, message = "Not found, the specified id does not exist."),
            @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fails. See response message for more information.")
    })
    @GetMapping(
            value    = "/developer-composite/{developerId}",
            produces = "application/json")
    DeveloperAggregate getDeveloper(@PathVariable int developerId);
}
