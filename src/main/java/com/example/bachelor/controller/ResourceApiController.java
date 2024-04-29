package com.example.bachelor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceApiController {
    @GetMapping("api/getResources")
    @CrossOrigin(origins = "*")
    public String getResources(){
        System.out.println("Nå kjører getResource");
        String tab = ResourceStringController.resourceMap.toString();
        System.out.println("Ressurser - " + ResourceStringController.resourceMap.toString());
        return "{\"message\": \"" + tab + "\"}";
        //return ResourceStringController.packageMap.toString();
    }
}
