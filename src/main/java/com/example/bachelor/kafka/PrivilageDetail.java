package com.example.bachelor.kafka;

import lombok.Data;

@Data
public class PrivilageDetail {

    // henrik@client.fintlabs.no
    private String username;

    // utdanning.elev.elev
    private String resource;

    // true
    private boolean access;

}