package labs.wyn;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/endpoints")
public class ExternalEndpointController {

    private final ExternalEndpointService externalEndpointService;

    public ExternalEndpointController(ExternalEndpointService externalEndpointService) {
        this.externalEndpointService = externalEndpointService;
    }

    @Get("/random")
    public ExternalEndpoint randomEndpoint() {
        return this.externalEndpointService.randomEndpoint();
    }
}
