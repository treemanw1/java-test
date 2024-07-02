package com.example.java_test.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProductID;
    private String ProductName;
    private Integer SupplierID;
    private Integer CategoryID;
    private Double QuantityPerUnit;
    private Double UnitPrice;
    private Integer UnitsInStock;
    private Integer UnitsOnOrder;
    private Integer ReorderLevel;
    private boolean Discontinued;

    public Product() {
    }

    public Product(Long productID, String productName, Integer supplierID, Integer categoryID, Double quantityPerUnit, Double unitPrice, Integer unitsInStock, Integer unitsOnOrder, Integer reorderLevel, boolean discontinued) {
        ProductID = productID;
        ProductName = productName;
        SupplierID = supplierID;
        CategoryID = categoryID;
        QuantityPerUnit = quantityPerUnit;
        UnitPrice = unitPrice;
        UnitsInStock = unitsInStock;
        UnitsOnOrder = unitsOnOrder;
        ReorderLevel = reorderLevel;
        Discontinued = discontinued;
    }
	
    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Integer supplierID) {
        SupplierID = supplierID;
    }

    public Integer getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Integer categoryID) {
        CategoryID = categoryID;
    }

    public Double getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(Double quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public Integer getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(Integer unitsOnOrder) {
        UnitsOnOrder = unitsOnOrder;
    }

    public Integer getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        Discontinued = discontinued;
    }
}
