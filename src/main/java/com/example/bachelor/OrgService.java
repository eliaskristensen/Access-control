package com.example.bachelor;

import com.example.bachelor.model.Organizations;
import com.example.bachelor.repository.OrgsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrgService {
    @Autowired
    private OrgsRepo orgsRepository;

    public List<Organizations> getAllOrganizations() {
        return orgsRepository.findAll();
    }

    public Optional<Organizations> updateOrganization(Organizations organizationDetails) {
        Optional<Organizations> organization = orgsRepository.findById(organizationDetails.getOrgnumber());
        if (organization.isPresent()) {
            Organizations existingOrganization = organization.get();
            existingOrganization.setOrgname(organizationDetails.getOrgname());
            existingOrganization.setAssetid(organizationDetails.getAssetid());
            return Optional.of(orgsRepository.save(existingOrganization));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteOrganization(Long orgnumber) {
        if (orgsRepository.existsById(orgnumber)) {
            orgsRepository.deleteById(orgnumber);
            return true;
        } else {
            return false;
        }
    }
}