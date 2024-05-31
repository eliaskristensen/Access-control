package com.example.bachelor.kafka;

import lombok.Data;

@Data
public class PrivilageDetail {
    private String username;
    private String resource;
    private boolean access;
}