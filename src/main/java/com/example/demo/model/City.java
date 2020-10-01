package com.example.demo.model;

import java.util.ArrayList;


public class City {

    private String cityName;
    private ArrayList<Store> stores = new ArrayList<>();

    public City() {
    }

    public void createStore(Store store) {
        stores.add(store);
    }

    public int readStoreIndex(String storeName) {
        int index = 0;
        for (int i = 0; i < stores.size(); i++) {
            if(stores.get(i).getStoreName().equals(storeName)){
                index = i;
            }
        }
        return index;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
