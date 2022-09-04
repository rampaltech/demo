package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to springboot demo...";
    }

    @GetMapping("/")
    public String firstMessage(){
        return "Welcome to first springboot message...";
    }
}
