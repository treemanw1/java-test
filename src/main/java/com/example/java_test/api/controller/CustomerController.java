package com.example.java_test.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_test.api.model.Customer;
import com.example.java_test.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	// @GetMapping("/test")
	// public List<Customer> getCustomers() {
	// 	return customerService.getCustomers();
	// }
	
    @PostMapping("/submit")
    @ResponseBody
    public ResponseEntity<?> getCustomers(
            @RequestParam("start_date") String startDateString,
            @RequestParam("end_date") String endDateString)
	{
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse(startDateString);
            endDate = dateFormat.parse(endDateString);
        } catch (ParseException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error parsing dates: " + e.getMessage());
        }

		List<Customer> customers = customerService.getCustomers(startDate, endDate);
        return ResponseEntity.ok(customers);
    }
}
