package com.example.bachelor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@RestController
public class ResourceStringController {
   // @CrossOrigin(origins = "no-corse")
    @PostMapping ("/api/resourceString")
    public ResponseEntity<String> resourceString(@RequestBody String test) {
        System.out.println(test + " println");
        //System.out.println(txt);
        return ResponseEntity.ok(test + "Hallo");
    }





}
