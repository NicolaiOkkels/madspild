package com.example.demo.data;

import com.example.demo.model.Cities;
import com.example.demo.model.City;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CitiesDataTest {
    Cities cities = new Cities();
    @Test
    void validateCityList() {
        //arrange
        ArrayList<City> citiesList = cities.buildCities();
        //act
        String name1 = "København NV";
        String name2 = "Roskilde";
        //assert
        assertEquals(citiesList.get(0).getCityName(), name1);
        assertEquals(citiesList.get(1).getCityName(), name2);
    }

    @Test
    void validateStoreList() {
        //arrange
        ArrayList<City> citiesList = cities.buildCities();
        //act
        String act1 = "Netto";
        String exp1 = citiesList.get(0).getStores().get(0).getStoreName(); //KBH NV

        String act2 = "Lokale købmand";
        String exp2 = citiesList.get(1).getStores().get(0).getStoreName(); //Roskilde
        //assert
        assertEquals(exp1, act1);
        assertEquals(exp2,act2);
    }

    @Test
    void validateProductList() {
        //arrange
        ArrayList<City> citiesList = cities.buildCities();
        //act
        String act1 = "Æble";
        String exp1 = citiesList.get(0).getStores().get(0).getStoreProducts().get(0).getProductName();

        String act2 = "Banan";
        String exp2 = citiesList.get(0).getStores().get(1).getStoreProducts().get(0).getProductName();
        //assert
        assertEquals(exp1, act1);
        assertEquals(exp2,act2);
    }
}