package br.com.ricardo.microservices.course.docs;

import br.com.ricardo.microservices.core.docs.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    public SwaggerConfig() {
        super("br.com.ricardo.microservices.course.endpoint.controller");
    }
}
