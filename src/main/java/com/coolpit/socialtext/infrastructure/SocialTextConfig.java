package com.coolpit.socialtext.infrastructure;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocialTextConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(apiInfo());
    }

    private Info apiInfo() {
        return new Info().title("Social Text REST API Backend Service")
                .version("1.0")
                .description("It handles and manages the process of the boox backend facilitation")
                .termsOfService(null)
                .license(null);
    }
}
