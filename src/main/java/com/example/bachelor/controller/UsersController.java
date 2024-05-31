package com.example.bachelor.controller;

import com.example.bachelor.UsersService;
import com.example.bachelor.model.Users;
import com.example.bachelor.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersRepo repo;

    @PostMapping("/api/setUsers")
    public void addUser(@RequestBody Users users){
        repo.save(users);
    }

    @Autowired
    private UsersService userService;

    @GetMapping("/api/getUsers")
    public List<Users> getUser(){
            return userService.getAllUsers();
        }
}
