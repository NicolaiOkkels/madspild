package com.example.demo.data;

import com.example.demo.model.City;

import java.util.ArrayList;


public class CitiesData {

    private ArrayList<City> cities = new ArrayList<>();

    public ArrayList<City> generateCities(){
        if(cities.isEmpty()){
            StoreData data = new StoreData();
            City city1 = new City();
            city1.setCityName("København NV");
            city1.setZipCode(2400);
            city1.setStores(data.generateKbhNVStores());

            cities.add(city1);

            City city2 = new City();
            city2.setCityName("Roskilde");
            city2.setZipCode(4000);
            city1.setStores(data.generateRoskildeStores());

            cities.add(city2);
        }

        return cities;
    }
}
