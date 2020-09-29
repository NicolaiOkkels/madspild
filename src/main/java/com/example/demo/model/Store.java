package com.example.demo.model;

import com.example.demo.data.CitiesData;

import java.util.ArrayList;

public class Store{

    private String storeName;
    private ArrayList<Product> storeProducts = new ArrayList<>();

    public Store() {
    }

    public Product loadProduct(int id){
        for (Product product:storeProducts) {
            if(product.getProductID()==id){
                return product;
            }
        }

        return null;
    }

    public void createProduct(Product product){
        int index = storeProducts.size();
        product.setProductID(++index);
        storeProducts.add(product);
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
