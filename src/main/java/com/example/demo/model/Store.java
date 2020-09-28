package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private String storeName;
    private List<Product> storeProducts = new ArrayList<>();

    public Store(String storeName) {
        this.storeName = storeName;
    }

    //Remove products from the list if expired
    public void deleteStoreProduct(){
        LocalDate date = LocalDate.now();
        for (Product product : storeProducts) {
            if(product.getExpireDate().compareTo(date)<0){
               storeProducts.remove(product);
            }
        }
    }
}
