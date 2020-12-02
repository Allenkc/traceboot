package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SampleConfig.class)
public class TraceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceBootApplication.class, args);
    }

}
