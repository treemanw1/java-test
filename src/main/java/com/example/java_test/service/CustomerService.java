package com.example.java_test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_test.api.model.Customer;
import com.example.java_test.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(Date startDate, Date endDate) {
        return customerRepository.getCustomers(startDate, endDate);
    }
}
