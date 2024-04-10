package com.example.bachelor.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceStringController {
    @PostMapping("/api/resourceString")
    public void resourceString(@RequestBody String fintPackage) { // kanskje returnere liste med ressurser i denne komponenten?
        System.out.println(fintPackage + "!!!!!!!!!!!");
        // Behandle fintPackage

        //return resourceString + " test";
    }
}
