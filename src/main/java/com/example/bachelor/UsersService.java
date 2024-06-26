package com.example.bachelor;

import com.example.bachelor.model.Users;
import com.example.bachelor.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepo userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}