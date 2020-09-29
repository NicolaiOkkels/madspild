package com.example.demo.data;

import com.example.demo.model.City;
import com.example.demo.model.Store;

import java.util.ArrayList;

public class StoreData {

    private ProductData productData = new ProductData();
    private City city = new City();

    public ArrayList<Store> generateKbhNVStores() {
        if (city.getStores().isEmpty()) {
            Store store1 = new Store();
            store1.setStoreName("Netto");
            store1.setStoreProducts(productData.generateProducts());

            city.createStore(store1);

            Store store2 = new Store();
            store2.setStoreName("Brugsen");
            store2.setStoreProducts(productData.generateProducts());

            city.createStore(store2);

            Store store3 = new Store();
            store3.setStoreName("Spar");
            store3.setStoreProducts(productData.generateProducts());

            city.createStore(store3);
        }

        return city.getStores();
    }

    public ArrayList<Store> generateRoskildeStores() {

        if (city.getStores().isEmpty()) {
            Store store1 = new Store();
            store1.setStoreName("Lokale købmand");
            store1.setStoreProducts(productData.generateProducts());

            city.createStore(store1);

            Store store2 = new Store();
            store2.setStoreName("Menu");
            store2.setStoreProducts(productData.generateProducts());

            city.createStore(store2);
        }
        return city.getStores();
    }
}
