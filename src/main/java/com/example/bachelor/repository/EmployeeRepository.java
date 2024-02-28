package com.example.bachelor.repository;

import com.example.bachelor.model.EmployeeAPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeAPI, Long> {
}