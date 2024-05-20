package com.example.bachelor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String fname;
    private String lname;
    private String Mail;
    private int Phone;
    private String Access;




}
