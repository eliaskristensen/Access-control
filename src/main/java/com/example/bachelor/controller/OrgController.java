package com.example.bachelor.controller;


import com.example.bachelor.OrgService;
import com.example.bachelor.model.Organizations;
import com.example.bachelor.repository.OrgsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orgApi/")
public class OrgController {

    @Autowired
    OrgsRepo repo;

    @PostMapping("setOrgs")
    public void addOrganizations(@RequestBody Organizations organizations){
        repo.save(organizations);
        System.out.println(organizations.toString());
    }


    @Autowired
    private OrgService orgService;


    @PutMapping()
    public ResponseEntity<Organizations> updateOrganization(@RequestBody Organizations organizationDetails) {
        Optional<Organizations> updatedOrganization = orgService.updateOrganization(organizationDetails);
        if (updatedOrganization.isPresent()) {
            return ResponseEntity.ok(updatedOrganization.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("getOrgs")
    public List<Organizations> getOrgs(){
        return orgService.getAllOrganizations();
    }//hei

}
