package com.akshaya.boutique.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cusId;
    private String cusName;
    private String contactNo;
    private Date date;
    private String chestRound;
    private String hipRound;
    private String seat;
    private String shoulder;
    private String armhole;
    private String fNeck;
    private String bNeck;
    private String sleeveLength;
    private String sleeveRound;
    private String height;
    private String belt;
    private String legRound;
    private String churidhar;
    private String blouse;

    // Getters and Setters
}
