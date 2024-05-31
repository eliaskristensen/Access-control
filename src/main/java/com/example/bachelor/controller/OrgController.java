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
// Had to change because it cannot be the same as on Users
@RequestMapping("/orgApi/")
public class OrgController {

    @Autowired
    OrgsRepo repo;

    @PostMapping("setOrgs")
    public void addOrganizations(@RequestBody Organizations organizations){
        repo.save(organizations);
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


    // Orgnumber to be deleted must be sent to the api
    // e.g. http://localhost:8080/orgApi/456172839
    @DeleteMapping("/{orgnumber}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable Long orgnumber) {
        boolean isDeleted = orgService.deleteOrganization(orgnumber);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
