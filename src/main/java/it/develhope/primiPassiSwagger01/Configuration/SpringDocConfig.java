package it.develhope.primiPassiSwagger01.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.lang.model.element.Name;

@OpenAPIDefinition(info =
@Info(title = "My personal API",
version = "1.0.0",
description = "API for the exercise Swagger 01",
termsOfService = "#",
license = @License(name = "", url = ""),
contact = @Contact(url = "https://www.linkedin.com/in/alessio-pollina-5b4027266/", name = "Alessio Pollina", email = "Pollinaalessio1@gmail.com")),
tags =
@Tag(name = "hello-controller", description = "This is the name of the tag"))


@Configuration
public class SpringDocConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .pathsToMatch("/public/**")
                .build();
    }
}
