package com.sktech.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${spring.application.name}")
    public String appName;

    @GetMapping(value = "/appName")
    public String getAppName(){
        return appName;
    }
}
