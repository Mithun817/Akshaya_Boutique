package com.akshaya.boutique;

import com.akshaya.boutique.model.Customer;
import com.akshaya.boutique.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerControllerTests {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setCusId("C001");
        customer.setCusName("Akshaya");
        customer.setContactNo("1234567890");
        customer.setPlace("Coimbatore");

        Customer savedCustomer = customerRepository.save(customer);
        assertNotNull(savedCustomer);
        assertEquals("Akshaya", savedCustomer.getCusName());
    }
}
