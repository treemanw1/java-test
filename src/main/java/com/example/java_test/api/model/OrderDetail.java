package com.example.java_test.api.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double UnitPrice;
    private Integer Quantity;
    private Double Discount;

    // @ManyToOne
    // @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    // private Product product;

    public OrderDetail() {
    }

    public OrderDetail(Long id, Double unitPrice, Integer quantity, Double discount) {
        this.id = id;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }
}
