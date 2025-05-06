package com.akshaya.boutique.repository;

import com.akshaya.boutique.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
