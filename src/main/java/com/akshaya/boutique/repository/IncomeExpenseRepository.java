package com.akshaya.boutique.repository;

import com.akshaya.boutique.model.IncomeExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeExpenseRepository extends JpaRepository<IncomeExpense, Long> {
}
