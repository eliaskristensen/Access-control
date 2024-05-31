package com.example.bachelor;

import com.example.bachelor.model.Users;
import com.example.bachelor.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// This is an object that may or may not contain a non-null value
// Source: https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepo userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> updateUser(Users userDetails) {
        Optional<Users> user = userRepository.findById(userDetails.getId());
        if (user.isPresent()) {
            Users existingUser = user.get();
            existingUser.setFname(userDetails.getFname());
            existingUser.setLname(userDetails.getLname());
            existingUser.setMail(userDetails.getMail());
            existingUser.setPhone(userDetails.getPhone());
            existingUser.setAccess(userDetails.getAccess());
            return Optional.of(userRepository.save(existingUser));
        } else {
            return Optional.empty();
        }
    }
}