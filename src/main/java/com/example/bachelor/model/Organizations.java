package com.example.bachelor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Organizations")
public class Organizations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String org_Name;
    private String Asset_ID;
    private String org_Number;
    }//Hei


