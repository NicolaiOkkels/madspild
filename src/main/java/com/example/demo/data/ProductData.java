package com.example.demo.data;

import com.example.demo.model.Product;
import com.example.demo.model.Store;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductData {
    private ArrayList<Product> storeProducts = new ArrayList<>();

    public ArrayList<Product> generateProduct(){
        if(storeProducts.isEmpty()){
            Product product1 = new Product();
            product1.setProductName("Æble");
            product1.setProductPrice(10);
            product1.setExpireDate(LocalDate.of(2020,9,26));

            storeProducts.add(product1);

            Product product2 = new Product();
            product2.setProductName("Banan");
            product2.setProductPrice(12);
            product2.setExpireDate(LocalDate.of(2020,9,30));

            storeProducts.add(product2);

            Product product3 = new Product();
            product1.setProductName("Pære");
            product1.setProductPrice(15);
            product1.setExpireDate(LocalDate.of(2020,10,1));

            storeProducts.add(product3);

        }

        return storeProducts;
    }
}
