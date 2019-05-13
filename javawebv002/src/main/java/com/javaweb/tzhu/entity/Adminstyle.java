package com.javaweb.tzhu.entity;

public class Adminstyle {
private Integer adminStyleld;
private String adminName;

    public Adminstyle() {
    }

    public Adminstyle(Integer adminStyleld, String adminName) {
        this.adminStyleld = adminStyleld;
        this.adminName = adminName;
    }

    public Integer getAdminStyleld() {
        return adminStyleld;
    }

    public void setAdminStyleld(Integer adminStyleld) {
        this.adminStyleld = adminStyleld;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "Adminstyle{" +
                "adminStyleld=" + adminStyleld +
                ", adminName='" + adminName + '\'' +
                '}';
    }
}
