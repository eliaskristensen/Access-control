package com.example.bachelor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceStringController {
    @PostMapping("/api/resourceString")
    public String resourceString(@RequestBody String resourceString) {

        System.out.println("Test fra frontend: " + resourceString);
        return resourceString;
    }
}
