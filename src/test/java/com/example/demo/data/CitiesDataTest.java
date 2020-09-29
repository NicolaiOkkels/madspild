package com.example.demo.data;

import com.example.demo.model.City;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CitiesDataTest {

    @Test
    void validateCityList() {
        //arrange
        ArrayList<City> cities = CitiesData.generateCities();
        //act
        String name1 = "København NV";
        String name2 = "Roskilde";
        //assert
        assertEquals(cities.get(0).getCityName(),name1);
        assertEquals(cities.get(1).getCityName(),name2);
    }

    @Test
    void validateStoreList() {
        //arrange
        ArrayList<City> cities = CitiesData.generateCities();
        //act
        String act = "Netto";
        String exp = cities.get(0).getStores().get(0).getStoreName();
        //assert
        assertEquals(exp,act);
    }
}