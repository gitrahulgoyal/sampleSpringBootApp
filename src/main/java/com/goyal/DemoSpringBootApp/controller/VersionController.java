package com.goyal.DemoSpringBootApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:app.properties")
public class VersionController {

    Logger logger = LoggerFactory.getLogger(VersionController.class);
    @Value("${version}")
    private String appVersion;

    @GetMapping("/version")
    public String index() {
        logger.info("version api called");
        return "current running version is: " + appVersion;
    }

}