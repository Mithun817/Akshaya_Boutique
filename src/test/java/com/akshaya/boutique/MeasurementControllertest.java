package com.akshaya.boutique;

import com.akshaya.boutique.model.Measurement;
import com.akshaya.boutique.repository.MeasurementRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MeasurementControllerTests {
    @Autowired
    private MeasurementRepository measurementRepository;

    @Test
    public void testCreateMeasurement() {
        Measurement measurement = new Measurement();
        measurement.setCusId("C001");
        measurement.setCusName("Akshaya");
        measurement.setContactNo("1234567890");
        measurement.setDate(new Date());
        measurement.setChestRound("36");
        // Set other fields as needed

        Measurement savedMeasurement = measurementRepository.save(measurement);
        assertNotNull(savedMeasurement);
        assertEquals("36", savedMeasurement.getChestRound());
    }
}
