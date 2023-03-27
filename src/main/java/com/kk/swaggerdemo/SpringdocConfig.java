package com.kk.swaggerdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Nemo Application Programmable Interfaces",
                version = "1.0",
                description = "An application to provide api to the Nemo product. NEMO is building a Medical Care Software and Services Platform for a 'NEW ERA' to enable fully delegated risk contracts for Independent Physician Groups",
                license = @License(name = ""),
                contact = @Contact(name = "", url = "", email = "")
        ),
        tags = {
                @Tag(name = "Nemo APIs", description = "APIs related to Nemo Application")
        }
)
public class SpringdocConfig {

    @Bean
    public GroupedOpenApi nemoApi() {
        return GroupedOpenApi.builder()
                .group("Nemo APIs")
                .packagesToScan("com.kk.swaggerdemo")
                .build();
    }

}
