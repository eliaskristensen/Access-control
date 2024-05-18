package com.example.bachelor;

import org.springframework.stereotype.Service;
import com.example.bachelor.kafka.PrivilageDetail;

@Service
public class SecurityService {

    // TODO: Implement these

    public boolean hasAccess(String username, String resource) {
        System.out.println("hasAccess");
        return false;
    }

    public void addPrivilageDetail(PrivilageDetail privilageDetail) {
        System.out.println("addPrivilageDetail");
    }

}
