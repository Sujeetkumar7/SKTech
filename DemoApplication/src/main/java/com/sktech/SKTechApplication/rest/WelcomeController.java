package com.sktech.SKTechApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String sayWelcome(){
        return "Welcom to SKTech..!!";
    }
}
