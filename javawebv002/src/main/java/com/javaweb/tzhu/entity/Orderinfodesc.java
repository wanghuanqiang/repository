package com.javaweb.tzhu.entity;

public class Orderinfodesc {
private Integer ordDTLld;
private Integer ordld;
private Integer foodld;
private Integer foodCount;

    public Orderinfodesc() {
    }

    public Orderinfodesc(Integer ordDTLld, Integer ordld, Integer foodld, Integer foodCount) {
        this.ordDTLld = ordDTLld;
        this.ordld = ordld;
        this.foodld = foodld;
        this.foodCount = foodCount;
    }

    public Integer getOrdDTLld() {
        return ordDTLld;
    }

    public void setOrdDTLld(Integer ordDTLld) {
        this.ordDTLld = ordDTLld;
    }

    public Integer getOrdld() {
        return ordld;
    }

    public void setOrdld(Integer ordld) {
        this.ordld = ordld;
    }

    public Integer getFoodld() {
        return foodld;
    }

    public void setFoodld(Integer foodld) {
        this.foodld = foodld;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    @Override
    public String toString() {
        return "Orderinfodesc{" +
                "ordDTLld=" + ordDTLld +
                ", ordld=" + ordld +
                ", foodld=" + foodld +
                ", foodCount=" + foodCount +
                '}';
    }
}
