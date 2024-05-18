package com.example.bachelor.controller;

import com.example.bachelor.SecurityService;
import com.example.bachelor.kafka.PrivilageDetail;
import com.example.bachelor.kafka.PrivilageDetailKafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaPrivilageController {

    private final SecurityService securityService;
    private final PrivilageDetailKafkaProducer privilageDetailKafkaProducer;
    @GetMapping
    public ResponseEntity<?> getData(@AuthenticationPrincipal Jwt jwt) {
        String username = (String) jwt.getClaims().get("cn");
        System.out.println("username:");
        System.out.println(username);
        if (securityService.hasAccess(username, "elev")) {
            return ResponseEntity.status(403).build();
        }

        return ResponseEntity.ok().build();
    }

    @PostMapping
    public void send(@RequestBody PrivilageDetail privilageDetail){
        privilageDetailKafkaProducer.sendPrivilageDetail(privilageDetail);
    }

}
