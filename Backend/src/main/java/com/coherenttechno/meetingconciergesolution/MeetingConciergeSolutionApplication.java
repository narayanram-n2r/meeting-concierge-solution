package com.coherenttechno.meetingconciergesolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.coherenttechno.meetingconciergesolution.client", "com.coherenttechno.meetingconciergesolution.repository",
        "com.coherenttechno.meetingconciergesolution.service", "com.coherenttechno.meetingconciergesolution.controller",
        "com.coherenttechno.meetingconciergesolution.exception", "com.coherenttechno.meetingconciergesolution.config"})
@EntityScan(basePackages = {"com.coherenttechno.meetingconciergesolution.repository.model"})
@EnableJpaRepositories(basePackages = {"com.coherenttechno.meetingconciergesolution.repository.dao"})
public class MeetingConciergeSolutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingConciergeSolutionApplication.class, args);
    }

}
