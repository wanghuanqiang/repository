package com.javaweb.tzhu.entity;

public class Orderinfo {
private Integer ordld;
private Integer customerld;
private String orderTime;
private Integer addressld;
private Double orderPriceSum;
private String orderPayMent;
private String orderDelivery;
private String ordNumber;

    public Orderinfo() {
    }

    public Orderinfo(Integer ordld, Integer customerld, String orderTime, Integer addressld, Double orderPriceSum, String orderPayMent, String orderDelivery, String ordNumber) {
        this.ordld = ordld;
        this.customerld = customerld;
        this.orderTime = orderTime;
        this.addressld = addressld;
        this.orderPriceSum = orderPriceSum;
        this.orderPayMent = orderPayMent;
        this.orderDelivery = orderDelivery;
        this.ordNumber = ordNumber;
    }

    public Integer getOrdld() {
        return ordld;
    }

    public void setOrdld(Integer ordld) {
        this.ordld = ordld;
    }

    public Integer getCustomerld() {
        return customerld;
    }

    public void setCustomerld(Integer customerld) {
        this.customerld = customerld;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getAddressld() {
        return addressld;
    }

    public void setAddressld(Integer addressld) {
        this.addressld = addressld;
    }

    public Double getOrderPriceSum() {
        return orderPriceSum;
    }

    public void setOrderPriceSum(Double orderPriceSum) {
        this.orderPriceSum = orderPriceSum;
    }

    public String getOrderPayMent() {
        return orderPayMent;
    }

    public void setOrderPayMent(String orderPayMent) {
        this.orderPayMent = orderPayMent;
    }

    public String getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(String orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public String getOrdNumber() {
        return ordNumber;
    }

    public void setOrdNumber(String ordNumber) {
        this.ordNumber = ordNumber;
    }

    @Override
    public String toString() {
        return "Orderinfo{" +
                "ordld=" + ordld +
                ", customerld=" + customerld +
                ", orderTime='" + orderTime + '\'' +
                ", addressld=" + addressld +
                ", orderPriceSum=" + orderPriceSum +
                ", orderPayMent='" + orderPayMent + '\'' +
                ", orderDelivery='" + orderDelivery + '\'' +
                ", ordNumber='" + ordNumber + '\'' +
                '}';
    }
}


