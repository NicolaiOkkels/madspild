package com.example.demo.model;

import java.util.ArrayList;


public class City{

    private String cityName;
    private int ZipCode;
    private ArrayList<Store> stores = new ArrayList<>();

    public City() {
    }

    public void createStore(Store store){
        stores.add(store);
    }

    public Store loadStore(String storeName){
        for (Store store: stores) {
            if(store.getStoreName() == storeName){
                return store;
            }
        }
        return null;
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

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }
}
