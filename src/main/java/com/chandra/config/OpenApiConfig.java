package com.chandra.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("springdoc.pathsToMatch")
    private String pathToMatch;

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("edp")
                .pathsToMatch(pathToMatch)
                .build();
    }

    @Bean
    public OpenAPI springOpenApi() {
        return new OpenAPI()
                .info(new Info().title("Spring OpenAPI")
                        .description("Spring   sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Spring OpenAPI Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }


}
