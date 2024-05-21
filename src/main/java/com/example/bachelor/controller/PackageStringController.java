package com.example.bachelor.controller;


import com.example.bachelor.ReflectionService;
import com.example.bachelor.ResourceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.ArrayList;

@RestController
//@RequestMapping("api/")
public class PackageStringController {
    static HashMap<String, Boolean> packageMap;
    //static HashMap<String, Boolean> resourceMap;
    // @CrossOrigin(origins = "no-corse")
    @PostMapping("api/packageString")
    public void resourceString(@RequestBody String valg) {
        System.out.println(valg + " println");
        String[] splitTab = valg.split(":");

        String oppdelt = splitTab[1].trim().replaceAll("[\"}]", "");

        System.out.println(oppdelt);
        packageMap = ReflectionService.readFintModel(oppdelt);
        //resourceMap = ResourceService.readRessursModel(oppdelt);
        System.out.println(packageMap);
        //System.out.println(txt);
        //return ResponseEntity.ok(packageMap + "Hallo");
    }

    @GetMapping//("api/test")
    @CrossOrigin(origins = "*")
    public String getResource(){
        System.out.println("Nå kjører getmapping");
        //return "{\"message\": \"yeehaw\"}";
        return packageMap.toString();
        //return ResourceStringController.packageMap.toString();
    }


}
