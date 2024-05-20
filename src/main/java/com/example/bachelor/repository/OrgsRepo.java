package com.example.bachelor.repository;

import com.example.bachelor.model.Organizations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgsRepo extends JpaRepository<Organizations,Long> {
}
//hei