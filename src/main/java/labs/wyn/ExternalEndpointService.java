package labs.wyn;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.inject.Singleton;

@Singleton
public class ExternalEndpointService {
    
    private static final List<ExternalEndpoint> ENDPOINTS = Arrays.asList(
        new ExternalEndpoint("Twitter"),
        new ExternalEndpoint("Facebook"),
        new ExternalEndpoint("Instagram"),
        new ExternalEndpoint("Google News")
    );

    public ExternalEndpoint randomEndpoint() { 
        return ENDPOINTS.get(new Random().nextInt(ENDPOINTS.size()));
    }
}
