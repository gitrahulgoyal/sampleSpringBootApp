package com.goyal.DemoSpringBootApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:app.properties")
public class SecretController {
    private Logger logger = LoggerFactory.getLogger(VersionController.class);
    @Value("${db.password}")
    private String appPassword;

    @GetMapping("/secret")
    public String secret() {
        logger.info("secret api called");
        return "Password stored is: " + appPassword;
    }
}