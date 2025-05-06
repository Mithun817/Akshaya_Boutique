package com.akshaya.boutique.repository;

import com.akshaya.boutique.model.CashMemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashMemoRepository extends JpaRepository<CashMemo, Long> {
}
