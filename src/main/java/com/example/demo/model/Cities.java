package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cities {

    private ArrayList<City> cities = new ArrayList<>();

    public ArrayList<City> buildCities() {
        if (cities.isEmpty()) {

            City city1 = new City();
            city1.setCityName("København NV");
            city1.setZipCode(2400);
            cities.add(city1);

            Store store1 = new Store();
            store1.setStoreName("Netto");
            store1.setAdresse("Netto addresse");
            city1.createStore(store1);

            Product product1 = new Product();
            product1.setProductName("Æble");
            product1.setProductPrice(10);
            product1.setDiscount(75);
            product1.setExpireDate(LocalDate.of(2020, 10, 1));
            product1.setReserved(false);

            Product product2 = new Product();
            product2.setProductName("Mælk");
            product2.setProductPrice(20);
            product2.setDiscount(50);
            product2.setExpireDate(LocalDate.of(2020, 10, 4));
            product2.setReserved(true);

            Product product3 = new Product();
            product3.setProductName("Jordbær");
            product3.setProductPrice(10);
            product3.setDiscount(60);
            product3.setExpireDate(LocalDate.of(2020, 10, 2));
            product3.setReserved(true);

            store1.createProduct(product1);
            store1.createProduct(product2);
            store1.createProduct(product3);

            Store store2 = new Store();
            store2.setStoreName("Brugsen");
            store2.setAdresse("Brugsen addresse");
            city1.createStore(store2);

            Product product4 = new Product();
            product4.setProductName("Banan");
            product4.setProductPrice(12);
            product4.setDiscount(75);
            product4.setExpireDate(LocalDate.of(2020, 9, 30));

            store2.createProduct(product4);

            Store store3 = new Store();
            store3.setStoreName("Spar");
            store3.setAdresse("Spar addresse");
            city1.createStore(store3);

            Product product5 = new Product();
            product5.setProductName("Pære");
            product5.setProductPrice(12);
            product5.setDiscount(75);
            product5.setExpireDate(LocalDate.of(2020, 10, 1));

            store3.createProduct(product5);

            //------------------------------------------------------------------------------------------//
            City city2 = new City();
            city2.setCityName("Roskilde");
            city2.setZipCode(4000);
            cities.add(city2);

            Store store4 = new Store();
            store4.setStoreName("Lokale købmand");
            store4.setAdresse("Købmand addresse");
            city2.createStore(store4);

            Product product6 = new Product();
            product6.setProductName("Brød");
            product6.setProductPrice(20);
            product6.setDiscount(75);
            product6.setExpireDate(LocalDate.of(2020, 9, 26));

            store4.createProduct(product6);

            Store store5 = new Store();
            store5.setStoreName("Menu");
            store5.setAdresse("Menu addresse");
            city2.createStore(store5);

            Product product7 = new Product();
            product7.setProductName("Grøntsagskasse");
            product7.setProductPrice(100);
            product7.setDiscount(75);
            product7.setExpireDate(LocalDate.of(2020, 10, 2));

            store5.createProduct(product7);
        }

        return cities;
    }

    public int readCityIndex(String cityName) {
        int index = 0;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getCityName().equalsIgnoreCase(cityName)) {
                index = i;
            }
        }
        return index;
    }

    public String refactorCityName(String cityName) {
        for (City city : cities) {
            if(city.getCityName().equalsIgnoreCase(cityName)){
               return city.getCityName();
            }
        }
        return null;
    }
}
