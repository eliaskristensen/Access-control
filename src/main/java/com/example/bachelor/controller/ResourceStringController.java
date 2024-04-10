package com.example.bachelor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceStringController {
    @GetMapping("/api/resourceString")
    public ResponseEntity<String> resourceString() {
        String resourceString = "grhsrnh";
        System.out.println("Test fra frontend: " + resourceString);
        return ResponseEntity.ok(resourceString + " test");
    }
}
