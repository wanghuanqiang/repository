package com.javaweb.tzhu.entity;

public class Address {
    private Integer addressld;
    private Integer customerld;
    private String address;

    public Address() {
    }

    public Address(Integer addressld, Integer customerld, String address) {
        this.addressld = addressld;
        this.customerld = customerld;
        this.address = address;
    }

    public Integer getAddressld() {
        return addressld;
    }

    public void setAddressld(Integer addressld) {
        this.addressld = addressld;
    }

    public Integer getCustomerld() {
        return customerld;
    }

    public void setCustomerld(Integer customerld) {
        this.customerld = customerld;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressld=" + addressld +
                ", customerld=" + customerld +
                ", address='" + address + '\'' +
                '}';
    }
}