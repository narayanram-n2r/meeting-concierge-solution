package com.coherenttechno.meetingconciergesolution.config;

/*
 * @created 10/07/2020 - 1:07 PM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.Collections;

/**
 * The type Generate api report.
 */
@EnableSwagger2WebMvc
@Configuration
public class ApiDocsConfig extends WebMvcConfigurationSupport{
    //    To document all the api in JSON data ->(GET) => localhost:8102/v2/api-docs
    //    To generate HTML endpoint -> localhost:8102/swagger-ui.html

    @Bean
    public Docket swaggerConfiguration() {
        //        Return a prepared Docket ionstance
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.coherenttechno.meetingconciergesolution"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Meeting Concierge Solutions",
                "An app to book facility online.",
                "1.0",
                "Property of Coherent Techno",
                new springfox.documentation.service.Contact("Narayan Ram Narayanan", "https://narayanramn2r.github.io/", "narayanramnarayanan@gmail.com"),
                "API License",
                "https://narayanramn2r.github.io/",
                Collections.emptyList()
        );
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
