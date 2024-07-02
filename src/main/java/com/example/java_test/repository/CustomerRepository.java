package com.example.java_test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.java_test.api.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// @Query(value = "SELECT c.* FROM `customers` c LEFT JOIN `orders` o ON c.id = o.customer_id GROUP BY c.id ORDER BY COUNT(o.id) DESC limit 10", nativeQuery = true)
    // List<Customer> getCustomers();
	@Query(value = "SELECT c.* FROM customers c " +
               "LEFT JOIN orders o ON c.id = o.customer_id " +
               "WHERE o.order_date BETWEEN :startDate AND :endDate " +
               "GROUP BY c.id " +
               "ORDER BY COUNT(o.id) DESC " +
               "LIMIT 10",
       nativeQuery = true)
	List<Customer> getCustomers(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
