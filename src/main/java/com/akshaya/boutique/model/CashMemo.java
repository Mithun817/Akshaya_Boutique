package com.akshaya.boutique.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class CashMemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cusId;
    private String cusName;
    private Date date;
    private String description;
    private int quantity;
    private double rate;
    private double amount;
    private double total;

    // Getters and Setters
}
