package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class DemoConfig implements ServletContextInitializer {

    private static final Logger log = LoggerFactory.getLogger(DemoConfig.class);

    private final SampleConfig sampleConfig;

    private Environment env;

    private ApplicationContext applicationContext;

    public DemoConfig(SampleConfig sampleConfig, Environment env, ApplicationContext applicationContext) {
        this.sampleConfig = sampleConfig;
        this.env = env;
        this.applicationContext = applicationContext;
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        log.info("SampleConfig isEnable:{}", sampleConfig.isEnable());
        log.info("SampleConfig name:{}", sampleConfig.getName());
        log.info("SampleConfig status:{}", sampleConfig.getStatus());

    }
}
