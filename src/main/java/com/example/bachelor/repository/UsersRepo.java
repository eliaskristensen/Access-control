package com.example.bachelor.repository;

import com.example.bachelor.model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long>{
}
