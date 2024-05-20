package com.example.bachelor.controller;


import com.example.bachelor.OrgService;
import com.example.bachelor.model.Organizations;
import com.example.bachelor.repository.OrgsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrgController {

    @Autowired
    OrgsRepo repo;

    @PostMapping("/api/setOrgs")
    public void addOrganizations(@RequestBody Organizations organizations){
        repo.save(organizations);
        System.out.println(organizations.toString());
    }


    @Autowired
    private OrgService orgService;


    @GetMapping("/api/getOrgs")
    public List<Organizations> getOrgs(){
        return orgService.getAllOrganizations();
    }//hei

}
