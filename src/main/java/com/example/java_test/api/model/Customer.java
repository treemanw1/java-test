package com.example.java_test.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String company;
    private String first_name;
    private String mobile_phone;
    private String fax_number;
    private String address;
    private String city;
    private String state_province;
    private String zip_postal_code;
    private String country_region;


    // @OneToMany(mappedBy = "customer")
    // private List<Order> orders;

    public Customer() {
    }

	public Customer(String companyName, String firstName, String address, String city, String stateProvince, String postalCode, String countryRegion, String mobilePhone, String faxNumber) {
        this.company = companyName;
        this.first_name = firstName;
        this.address = address;
        this.city = city;
        this.state_province = stateProvince;
        this.zip_postal_code = postalCode;
        this.country_region = countryRegion;
        this.mobile_phone = mobilePhone;
        this.fax_number = faxNumber;
    }

    public Long getCustomerID() {
        return id;
    }

    public void setCustomerID(Long customerID) {
        this.id = customerID;
    }

    public String getCompanyName() {
        return company;
    }

    public void setCompanyName(String companyName) {
        this.company = companyName;
    }

    public String getContactName() {
        return first_name;
    }

    public void setContactName(String contactName) {
        this.first_name = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return state_province;
    }

    public void setStateProvince(String stateProvince) {
        this.state_province= stateProvince;
    }

    public String getZipPostalCode() {
        return zip_postal_code;
    }

    public void setZipPostalCode(String postalCode) {
        this.zip_postal_code= postalCode;
    }

    public String getCountryRegion() {
        return country_region;
    }

    public void setCountryRegion(String countryRegion) {
        this.country_region = countryRegion;
    }

    public String getMobilePhone() {
        return mobile_phone;
    }

    public void setMobilePhone(String phone) {
        this.mobile_phone = phone;
    }

    public String getFaxNumber() {
        return fax_number;
    }

    public void setFaxNumber(String fax) {
        this.fax_number = fax;
    }

    // public List<Order> getOrders() {
    //     return orders;
    // }

    // public void setOrders(List<Order> orders) {
    //     this.orders = orders;
    // }
}
