package labs.wyn;

import io.micronaut.core.annotation.Introspected;

@Introspected // To generate BeanIntrospection metadata at compilation time. This information is used to the render the POJO as json using Jackson without using reflection.
public class ExternalEndpoint {
    private String name;

    public ExternalEndpoint(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
