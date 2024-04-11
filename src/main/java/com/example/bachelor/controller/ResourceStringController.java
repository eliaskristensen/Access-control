package com.example.bachelor.controller;

<<<<<<< HEAD
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
=======
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
>>>>>>> 6aa8fbc81e0cda1f1dd00c8e8dd4c9138791f820
    }





}
