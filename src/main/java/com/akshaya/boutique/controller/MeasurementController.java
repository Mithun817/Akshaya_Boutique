package com.akshaya.boutique.controller;

import com.akshaya.boutique.model.Measurement;
import com.akshaya.boutique.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {
    @Autowired
    private MeasurementRepository measurementRepository;

    @GetMapping
    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    @PostMapping
    public Measurement createMeasurement(@RequestBody Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    // Additional methods (update, delete) can be added here
}
