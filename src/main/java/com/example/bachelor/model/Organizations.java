package com.example.bachelor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Organizations")
public class Organizations {
    @Id
    private Long orgnumber;
    private String orgname;
    private String assetid;
    }


