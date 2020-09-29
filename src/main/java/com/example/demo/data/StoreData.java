package com.example.demo.data;

import com.example.demo.model.Store;

import java.util.ArrayList;

public class StoreData {

    private static ArrayList<Store> stores = new ArrayList<>();

    public static ArrayList<Store> generateStores(){
        if(stores.isEmpty()){

            Store store1 = new Store();
            store1.setStoreName("Netto");
            store1.setStoreProducts(ProductData.generateProduct());

            stores.add(store1);

            Store store2 = new Store();
            store2.setStoreName("Brugsen");
            store2.setStoreProducts(ProductData.generateProduct());

            stores.add(store2);

            Store store3 = new Store();
            store3.setStoreName("Spar");
            store3.setStoreProducts(ProductData.generateProduct());

            stores.add(store3);
        }
        return stores;
    }
}
