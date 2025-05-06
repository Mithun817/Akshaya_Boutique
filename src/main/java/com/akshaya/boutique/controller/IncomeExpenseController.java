package com.akshaya.boutique.controller;

import com.akshaya.boutique.model.IncomeExpense;
import com.akshaya.boutique.repository.IncomeExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incomeexpenses")
public class IncomeExpenseController {
    @Autowired
    private IncomeExpenseRepository incomeExpenseRepository;

    @GetMapping
    public List<IncomeExpense> getAllIncomeExpenses() {
        return incomeExpenseRepository.findAll();
    }

    @PostMapping
    public IncomeExpense createIncomeExpense(@RequestBody IncomeExpense incomeExpense) {
        return incomeExpenseRepository.save(incomeExpense);
    }

    // Additional methods (update, delete) can be added here
}
