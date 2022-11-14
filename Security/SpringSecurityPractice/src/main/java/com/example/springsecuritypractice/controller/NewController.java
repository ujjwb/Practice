package com.example.springsecuritypractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/security")
    public String securityCheck(){
        return "Authorised!!";
    }
}
