package com.example.bachelor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String email;
    private String phonenumber;
    private String role;
    private String key;
    private boolean value;

    public Client() {
    }

    public Client(String name, String email, String phonenumber, String role, String key, boolean value) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.role = role;
        this.key = key;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
    public String getRole() {
        return role;
    }
    public String getKey() {
        return key;
    }
    public boolean getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {this.phonenumber = phonenumber;}
    public void setRole(String role) {
        this.role = role;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public void setValue(boolean value) {
        this.value = value;
    }



}

