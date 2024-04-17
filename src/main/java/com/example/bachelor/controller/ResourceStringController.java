package com.example.bachelor.controller;


import com.example.bachelor.ReflectionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@RestController
//@RequestMapping("api/")
public class ResourceStringController {
    static HashMap<String, Boolean> packageMap;
   // @CrossOrigin(origins = "no-corse")
    @PostMapping("api/resourceString")
    public void resourceString(@RequestBody String test) {
        System.out.println(test + " println");
        String[] splitTab = test.split(":");

        String oppdelt = splitTab[1].trim().replaceAll("[\"}]", "");

        System.out.println(oppdelt);
        packageMap = ReflectionService.readFintModel(oppdelt);
        System.out.println(packageMap);
        //System.out.println(txt);
        //return ResponseEntity.ok(packageMap + "Hallo");
    }
/*
    @GetMapping//("api/test")
    @CrossOrigin(origins = "*")
    public String getResource(){
        System.out.println("Nå kjører getmapping");
        //return "{\"message\": \"yeehaw\"}";
        return packageMap.toString();
        //return ResourceStringController.packageMap.toString();
    }*/


}
