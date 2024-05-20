package com.example.bachelor;

import com.example.bachelor.model.Organizations;
import com.example.bachelor.repository.OrgsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgService {
    @Autowired
    private OrgsRepo orgsRepository;

    public List<Organizations> getAllOrganizations() {
        return orgsRepository.findAll();
    }
}//hei