package com.example.bachelor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String role;
    private String key;
    private boolean value;
    private String packageName;
    private String access;

    public Client() {
    }

    public Client(String name, String role, String key, boolean value, String access) {
        this.name = name;
        this.role = role;
        this.key = key;
        this.value = value;
        this.access = access;

    }
}

