package com.lyhteixeirah.ponto.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableOpenApi
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lyhteixeirah.ponto.controllers"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .useDefaultResponseMessages(true);
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Api-Rest-Spring-Gradle-H2-Hibernate_Envers-Swagger")
                .description(" Digital Innovation one, Santander FullStack Bootcamp, 2021")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Lyhteixeirah", "https://github.com/LyhTeixeirah", "https://www.linkedin.com/in/lielsesteixeira/"))
                .build();
    }
}
