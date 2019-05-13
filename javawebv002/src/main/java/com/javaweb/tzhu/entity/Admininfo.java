package com.javaweb.tzhu.entity;

public class Admininfo {
private Integer adminld;
private String adminName;
private String adminPass;
private Integer adminSyle;
private String adminEmail;

    public Admininfo() {
    }

    public Admininfo(Integer adminld, String adminName, String adminPass, Integer adminSyle, String adminEmail) {
        this.adminld = adminld;
        this.adminName = adminName;
        this.adminPass = adminPass;
        this.adminSyle = adminSyle;
        this.adminEmail = adminEmail;
    }

    public Integer getAdminld() {
        return adminld;
    }

    public void setAdminld(Integer adminld) {
        this.adminld = adminld;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public Integer getAdminSyle() {
        return adminSyle;
    }

    public void setAdminSyle(Integer adminSyle) {
        this.adminSyle = adminSyle;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "Admininfo{" +
                "adminld=" + adminld +
                ", adminName='" + adminName + '\'' +
                ", adminPass='" + adminPass + '\'' +
                ", adminSyle=" + adminSyle +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
