package com.akshaya.boutique.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class IncomeExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String incomeDescription;
    private double incomeAmount;
    private String expensesDescription;
    private double expensesAmount;

    // Getters and Setters
}
