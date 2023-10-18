package com.example.boot.JenkinDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/city")
    public String getCities() {
        return "Chennai City";
    }
}
