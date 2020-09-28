package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Product {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expireDate;
    private String productName;
    private double productPrice;

    public Product(LocalDate expireDate, String productName, double productPrice) {
        this.expireDate = expireDate;
        this.productName = productName;
        this.productPrice = productPrice;
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
}
