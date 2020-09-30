package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Product {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expireDate;
    private String productName;
    private double productPrice;
    private double discount;
    private int productID;
    private boolean isReserved;

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //TODO:Virker ikke som forventet
    public double getCalcDiscountPrice(){
        double discountPrice = productPrice - ((productPrice / discount) * productPrice);
        double roundOff = Math.round(discountPrice * 100.0) / 100.0;
        return roundOff;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isReserved() {
        return isReserved;
    }


}
