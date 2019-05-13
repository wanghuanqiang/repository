package com.javaweb.tzhu.entity;

public class Lunchtime {
private Integer lunchld;
private String lunchName;

    public Lunchtime() {
    }

    public Lunchtime(Integer lunchld, String lunchName) {
        this.lunchld = lunchld;
        this.lunchName = lunchName;
    }

    public Integer getLunchld() {
        return lunchld;
    }

    public void setLunchld(Integer lunchld) {
        this.lunchld = lunchld;
    }

    public String getLunchName() {
        return lunchName;
    }

    public void setLunchName(String lunchName) {
        this.lunchName = lunchName;
    }

    @Override
    public String toString() {
        return "Lunchtime{" +
                "lunchld=" + lunchld +
                ", lunchName='" + lunchName + '\'' +
                '}';
    }
}
