package com.hackathon.ai_cron.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TestController {
    @Value("${welcome.message}")
    private String welcomeMessage;

    @RequestMapping("/")
    public String index(){
        return welcomeMessage + Instant.now().toString();
    }
}