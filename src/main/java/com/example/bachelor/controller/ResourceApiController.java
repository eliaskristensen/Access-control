package com.example.bachelor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceApiController {
    @GetMapping("api/getComponents")
    @CrossOrigin(origins = "*")
    public String getResource(){
        System.out.println("Nå kjører getmapping");
        String tab = ResourceStringController.packageMap.toString();

        return "{\"message\": \"" + tab + "\"}";
        //return ResourceStringController.packageMap.toString();
    }
}
