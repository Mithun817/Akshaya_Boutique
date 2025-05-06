package com.akshaya.boutique.controller;

import com.akshaya.boutique.model.CashMemo;
import com.akshaya.boutique.repository.CashMemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashmemos")
public class CashMemoController {
    @Autowired
    private CashMemoRepository cashMemoRepository;

    @GetMapping
    public List<CashMemo> getAllCashMemos() {
        return cashMemoRepository.findAll();
    }

    @PostMapping
    public CashMemo createCashMemo(@RequestBody CashMemo cashMemo) {
        return cashMemoRepository.save(cashMemo);
    }

    // Additional methods (update, delete) can be added here
}
