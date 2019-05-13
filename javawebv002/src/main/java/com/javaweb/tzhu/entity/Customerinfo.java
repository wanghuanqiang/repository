package com.javaweb.tzhu.entity;

public class Customerinfo {
private Integer customerld;
private String customerName;
private String customerPass;
private String customerSex;
private String customerBirdthday;
private String customerEmail;
private String customerPhone;
private Integer customerCredit;
private String realName;

    public Customerinfo() {
    }

    public Customerinfo(Integer customerld, String customerName, String customerPass, String customerSex, String customerBirdthday, String customerEmail, String customerPhone, Integer customerCredit, String realName) {
        this.customerld = customerld;
        this.customerName = customerName;
        this.customerPass = customerPass;
        this.customerSex = customerSex;
        this.customerBirdthday = customerBirdthday;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerCredit = customerCredit;
        this.realName = realName;
    }

    public Integer getCustomerld() {
        return customerld;
    }

    public void setCustomerld(Integer customerld) {
        this.customerld = customerld;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerBirdthday() {
        return customerBirdthday;
    }

    public void setCustomerBirdthday(String customerBirdthday) {
        this.customerBirdthday = customerBirdthday;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(Integer customerCredit) {
        this.customerCredit = customerCredit;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Customerinfo{" +
                "customerld=" + customerld +
                ", customerName='" + customerName + '\'' +
                ", customerPass='" + customerPass + '\'' +
                ", customerSex='" + customerSex + '\'' +
                ", customerBirdthday='" + customerBirdthday + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerCredit=" + customerCredit +
                ", realName='" + realName + '\'' +
                '}';
    }
}
