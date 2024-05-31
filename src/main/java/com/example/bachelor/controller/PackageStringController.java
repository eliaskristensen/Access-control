package com.example.bachelor.controller;

import com.example.bachelor.ReflectionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.HashMap;

@RestController
public class PackageStringController {
    static HashMap<String, Boolean> packageMap;
    @PostMapping("api/packageString")
    public void resourceString(@RequestBody String choice) {
        String[] splitTab = choice.split(":");
        String split = splitTab[1].trim().replaceAll("[\"}]", "");
        packageMap = ReflectionService.readFintModel(split);
    }
}
