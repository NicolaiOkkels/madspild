package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String cityName;
    private int ZipCode;
    private List<Store> cityStores = new ArrayList<>();

    public City(String cityName, int zipCode) {
        this.cityName = cityName;
        ZipCode = zipCode;
    }

    public void create(Store store){
        cityStores.add(store);
    }
}
