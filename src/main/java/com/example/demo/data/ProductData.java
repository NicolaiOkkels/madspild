package com.example.demo.data;

import com.example.demo.model.Product;
import com.example.demo.model.Store;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductData {

    private Store store = new Store();

    public ArrayList<Product> generateProducts(){

        if(store.getStoreProducts().isEmpty()){
            Product product1 = new Product();
            product1.setProductName("Æble");
            product1.setProductPrice(10);
            product1.setDiscount(75);
            product1.setExpireDate(LocalDate.of(2020,9,26));

            store.createProduct(product1);

            Product product2 = new Product();
            product2.setProductName("Banan");
            product2.setProductPrice(12);
            product2.setDiscount(75);
            product2.setExpireDate(LocalDate.of(2020,9,30));

            store.createProduct(product2);

            Product product3 = new Product();
            product3.setProductName("Pære");
            product3.setDiscount(40);
            product3.setProductPrice(15);
            product3.setExpireDate(LocalDate.of(2020,10,1));

            store.createProduct(product2);

        }

        return store.getStoreProducts();
    }
}
