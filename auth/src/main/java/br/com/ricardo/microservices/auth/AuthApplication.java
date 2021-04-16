package br.com.ricardo.microservices.auth;

import br.com.ricardo.microservices.core.property.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties(value = JwtConfiguration.class)
@EntityScan({"br.com.ricardo.microservices.core.model"})
@EnableJpaRepositories({"br.com.ricardo.microservices.core.repository"})
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
