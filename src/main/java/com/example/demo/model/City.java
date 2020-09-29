package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String cityName;
    private int ZipCode;
    private ArrayList<Store> stores = new ArrayList<>();

    public City(String cityName, int zipCode) {
        this.cityName = cityName;
        ZipCode = zipCode;
    }

    public City() {
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
