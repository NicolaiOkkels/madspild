package com.example.demo.data;

import com.example.demo.model.City;

import java.util.ArrayList;


public class CitiesData {

    private static ArrayList<City> cities = new ArrayList<>();

    public static ArrayList<City> generateCities(){
        if(cities.isEmpty()){

            City city1 = new City();
            city1.setCityName("København NV");
            city1.setZipCode(2400);
            city1.setStores(StoreData.generateStores());

            cities.add(city1);

            City city2 = new City();
            city2.setCityName("Roskilde");
            city2.setZipCode(4000);
            city1.setStores(StoreData.generateStores());

            cities.add(city2);

            City city3 = new City();
            city3.setCityName("Aahus C");
            city3.setZipCode(8000);
            city1.setStores(StoreData.generateStores());

            cities.add(city3);

            City city4 = new City();
            city4.setCityName("Slagelse");
            city4.setZipCode(4200);
            city1.setStores(StoreData.generateStores());

            cities.add(city4);
        }

        return cities;
    }
}
