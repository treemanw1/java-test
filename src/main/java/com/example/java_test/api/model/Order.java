package com.example.java_test.api.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employee_id;
    private Long customer_id;
    private Date order_date;
    private Date shipped_date;
    private String ShipVia;
    private Double Freight;
    private String ShipName;
    private String ShipAddress;
    private String ShipCity;
    private String ShipRegion;
    private String ShipPostalCode;
    private String ShipCountry;

    public Order() {
    }

    public Order(Long orderID, Long customerID, Long employeeID, Date orderDate, Date requiredDate, Date shippedDate, String shipVia, Double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
        id = orderID;
        // customer_id = customerID;
        employee_id= employeeID;
        order_date = orderDate;
        shipped_date = shippedDate;
        ShipVia = shipVia;
        Freight = freight;
        ShipName = shipName;
        ShipAddress = shipAddress;
        ShipCity = shipCity;
        ShipRegion = shipRegion;
        ShipPostalCode = shipPostalCode;
        ShipCountry = shipCountry;
    }

    public Long getOrderID() {
        return id;
    }

    public void setOrderID(Long orderID) {
        id = orderID;
    }

    public Long getCustomerID() {
        return customer_id;
    }

    public void setCustomerID(Long customerID) {
        customer_id = customerID;
    }

    public Long getEmployeeID() {
        return employee_id;
    }

    public void setEmployeeID(Long employeeID) {
        employee_id = employeeID;
    }

    public Date getOrderDate() {
        return order_date;
    }

    public void setOrderDate(Date orderDate) {
        order_date = orderDate;
    }

    public Date getShippedDate() {
        return shipped_date;
    }

    public void setShippedDate(Date shippedDate) {
        shipped_date = shippedDate;
    }

    public String getShipVia() {
        return ShipVia;
    }

    public void setShipVia(String shipVia) {
        ShipVia = shipVia;
    }

    public Double getFreight() {
        return Freight;
    }

    public void setFreight(Double freight) {
        Freight = freight;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String shipName) {
        ShipName = shipName;
    }

    public String getShipAddress() {
        return ShipAddress;
    }

    public void setShipAddress(String shipAddress) {
        ShipAddress = shipAddress;
    }

    public String getShipCity() {
        return ShipCity;
    }

    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }

    public String getShipRegion() {
        return ShipRegion;
    }

    public void setShipRegion(String shipRegion) {
        ShipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return ShipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        ShipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return ShipCountry;
    }

    public void setShipCountry(String shipCountry) {
        ShipCountry = shipCountry;
    }
}
