package com.example.demo.data;

import com.example.demo.model.City;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CitiesDataTest {
    CitiesData data = new CitiesData();
    @Test
    void validateCityList() {
        //arrange
        ArrayList<City> cities = data.generateCities();
        //act
        String name1 = "København NV";
        String name2 = "Roskilde";
        //assert
        assertEquals(cities.get(0).getCityName(), name1);
        assertEquals(cities.get(1).getCityName(), name2);
    }

    @Test
    void validateStoreList() {
        //arrange
        ArrayList<City> cities = data.generateCities();
        //act
        String act1 = "Netto";
        String exp1 = cities.get(0).getStores().get(0).getStoreName(); //KBH NV

        String act2 = "Lokale købmand";
        String exp2 = cities.get(1).getStores().get(0).getStoreName(); //Roskilde
        //assert
        assertEquals(exp1, act1);
        assertEquals(exp2,act2);
    }

    @Test
    void validateProductList() {
        //arrange
        ArrayList<City> cities = data.generateCities();
        //act
        String act1 = "Æble";
        String exp1 = cities.get(0).getStores().get(0).getStoreProducts().get(0).getProductName();

        String act2 = "Banan";
        String exp2 = cities.get(0).getStores().get(0).getStoreProducts().get(1).getProductName();
        //assert
        assertEquals(exp1, act1);
        assertEquals(exp2,act2);
    }
}