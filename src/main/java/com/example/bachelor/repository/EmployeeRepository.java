package com.example.bachelor.repository;

import com.example.bachelor.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Client, Long> {
}
