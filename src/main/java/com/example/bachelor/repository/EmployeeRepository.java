package com.example.bachelor.repository;

import com.example.bachelor.model.Client;
import com.example.bachelor.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Resource, Long> {



}
