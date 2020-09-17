package com.sktech.SKTechCRUDApi.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SKTechDemo {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String sayWelcome(){
        return "Welcome to SKTech";
    }
}
