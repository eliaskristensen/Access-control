package com.example.bachelor.controller;


import com.example.bachelor.UsersService;
import com.example.bachelor.model.Users;
import com.example.bachelor.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// denne er forklart i Userservice-klassen
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class UsersController {

    @Autowired
    UsersRepo repo;

    @PostMapping("setUsers")
    public void addUser(@RequestBody Users users){
        repo.save(users);
        System.out.println(users.toString());
    }
    @Autowired
    private UsersService usersService;

    @PutMapping
    public ResponseEntity<Users> updateUser(@RequestBody Users userDetails) {
        Optional<Users> updatedUser = userService.updateUser(userDetails);
        if (updatedUser.isPresent()) {
            return ResponseEntity.ok(updatedUser.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Autowired
    private UsersService userService;


    @GetMapping("getUsers")
    public List<Users> getUser(){
            return userService.getAllUsers();
        }

}
