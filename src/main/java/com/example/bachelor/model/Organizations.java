package com.example.bachelor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "organizations")
public class Organizations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orgName;
    private String assetID;
    private String orgNumber;
    }//Hei


