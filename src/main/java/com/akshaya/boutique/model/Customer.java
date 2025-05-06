package com.akshaya.boutique.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private String cusId;
    private String cusName;
    private String contactNo;
    private String place;

    // Getters and Setters
}
