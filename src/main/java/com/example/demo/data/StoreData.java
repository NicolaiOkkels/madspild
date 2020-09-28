package com.example.demo.data;

import com.example.demo.model.Store;

import java.util.ArrayList;

public class StoreData {

    private ArrayList<Store> stores = new ArrayList<>();

    public ArrayList<Store> generateStores(){
        if(stores.isEmpty()){
            ProductData productData = new ProductData();

            Store store1 = new Store();
            store1.setStoreName("Netto");
            store1.setStoreProducts(productData.generateProduct());

            stores.add(store1);

            Store store2 = new Store();
            store2.setStoreName("Brugsen");
            store2.setStoreProducts(productData.generateProduct());

            stores.add(store2);

            Store store3 = new Store();
            store3.setStoreName("Spar");
            store3.setStoreProducts(productData.generateProduct());

            stores.add(store3);
        }
        return stores;
    }
}
