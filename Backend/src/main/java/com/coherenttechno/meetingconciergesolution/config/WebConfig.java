package com.coherenttechno.meetingconciergesolution.config;

/*
 * @created 10/07/2020 - 1:12 PM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}










