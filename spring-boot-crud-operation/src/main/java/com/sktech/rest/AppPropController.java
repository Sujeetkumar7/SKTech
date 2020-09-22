package com.sktech.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppPropController {
    @Value("${spring.application.name}")
    public String appName;

    @GetMapping(value = "/appName")
    public String appName(){
        return appName;
    }
}
