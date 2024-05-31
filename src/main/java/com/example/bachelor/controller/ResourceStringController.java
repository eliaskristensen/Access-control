package com.example.bachelor.controller;


import com.example.bachelor.ResourceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@RestController
public class ResourceStringController {
    static HashMap<String, Boolean> resourceMap;
    @PostMapping("api/resourceString")
    public void resourceString(@RequestBody String valg) {
        String[] splitTab = valg.split(":");
        String oppdelt = splitTab[1].trim().replaceAll("[\"}]", "");
        resourceMap = ResourceService.readRessursModel(oppdelt);
    }
}
