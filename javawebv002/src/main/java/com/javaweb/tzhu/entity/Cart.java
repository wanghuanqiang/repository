package com.javaweb.tzhu.entity;

public class Cart {
private Integer cartld;
private Integer userld;
private Integer foodld;
private Integer foodCount;

    public Cart() {
    }

    public Cart(Integer cartld, Integer userld, Integer foodld, Integer foodCount) {
        this.cartld = cartld;
        this.userld = userld;
        this.foodld = foodld;
        this.foodCount = foodCount;
    }

    public Integer getCartld() {
        return cartld;
    }

    public void setCartld(Integer cartld) {
        this.cartld = cartld;
    }

    public Integer getUserld() {
        return userld;
    }

    public void setUserld(Integer userld) {
        this.userld = userld;
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
        return "Cart{" +
                "cartld=" + cartld +
                ", userld=" + userld +
                ", foodld=" + foodld +
                ", foodCount=" + foodCount +
                '}';
    }
}
