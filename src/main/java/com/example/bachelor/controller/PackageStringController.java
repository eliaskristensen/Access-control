package com.example.bachelor.controller;


import com.example.bachelor.ReflectionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@RestController
public class PackageStringController {
    static HashMap<String, Boolean> packageMap;
    @PostMapping("api/packageString")
    public void resourceString(@RequestBody String valg) {
        String[] splitTab = valg.split(":");
        String oppdelt = splitTab[1].trim().replaceAll("[\"}]", "");
        packageMap = ReflectionService.readFintModel(oppdelt);
    }

    @GetMapping//("api/test")
    @CrossOrigin(origins = "*")
    public String getResource(){
        return packageMap.toString();
    }
}
