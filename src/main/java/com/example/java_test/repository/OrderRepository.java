package com.example.java_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java_test.api.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
