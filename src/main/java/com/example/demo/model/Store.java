package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Store {

    private String storeName;
    private ArrayList<Product> storeProducts = new ArrayList<>();

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public Store() {
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Product> getStoreProducts() {
        return storeProducts;
    }

    public void setStoreProducts(ArrayList<Product> storeProducts) {
        this.storeProducts = storeProducts;
    }
}
