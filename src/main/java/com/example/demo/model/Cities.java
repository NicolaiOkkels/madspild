package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cities {

    private ArrayList<City> cities = new ArrayList<>();

    public ArrayList<City> buildCities() {
        if (cities.isEmpty()) {

            //--------------City 1------------------//
            City city1 = new City();
            city1.setCityName("København");
            cities.add(city1);

            //------------Store 1---------------//
            Store store1 = new Store();
            store1.setStoreName("Netto");
            store1.setAdresse("Tomsgardsvej 15");
            city1.createStore(store1);

            Product product1 = new Product();
            product1.setProductName("Æbler 1 kg");
            product1.setProductPrice(27);
            product1.setDiscount(75);
            product1.setExpireDate(LocalDate.of(2020, 10, 1));
            product1.setQuantity(3);

            Product product2 = new Product();
            product2.setProductName("Mælk");
            product2.setProductPrice(20);
            product2.setDiscount(50);
            product2.setExpireDate(LocalDate.of(2020, 10, 4));
            product2.setQuantity(11);

            Product product3 = new Product();
            product3.setProductName("Jordbær");
            product3.setProductPrice(10);
            product3.setDiscount(60);
            product3.setExpireDate(LocalDate.of(2020, 10, 2));
            product3.setReserved(true);
            product3.setQuantity(2);

            Product product4 = new Product();
            product4.setProductName("Advocado");
            product4.setProductPrice(35);
            product4.setDiscount(60);
            product4.setExpireDate(LocalDate.of(2020, 10, 2));
            product4.setReserved(true);
            product4.setQuantity(6);

            Product product5 = new Product();
            product5.setProductName("Champignon");
            product5.setProductPrice(10);
            product5.setDiscount(60);
            product5.setExpireDate(LocalDate.of(2020, 10, 2));
            product5.setReserved(true);
            product5.setQuantity(2);

            Product product6 = new Product();
            product6.setProductName("Cherrytomater");
            product6.setProductPrice(10);
            product6.setDiscount(60);
            product6.setExpireDate(LocalDate.of(2020, 10, 2));
            product6.setQuantity(5);

            Product product7 = new Product();
            product7.setProductName("Økologisk salatmix");
            product7.setProductPrice(10);
            product7.setDiscount(60);
            product7.setExpireDate(LocalDate.of(2020, 10, 2));
            product7.setReserved(true);
            product7.setQuantity(2);

            Product product8 = new Product();
            product8.setProductName("Kyllinge brystfilet 0.8 kg");
            product8.setProductPrice(95);
            product8.setDiscount(60);
            product8.setExpireDate(LocalDate.of(2020, 10, 2));
            product8.setQuantity(4);

            Product product9 = new Product();
            product9.setProductName("Hakket Oksekød 0.8 kg");
            product9.setProductPrice(55);
            product9.setDiscount(60);
            product9.setExpireDate(LocalDate.of(2020, 10, 2));
            product9.setQuantity(4);

            Product product10 = new Product();
            product10.setProductName("Stegeflæsk 0.4 kg");
            product10.setProductPrice(38.95);
            product10.setDiscount(60);
            product10.setExpireDate(LocalDate.of(2020, 10, 2));
            product10.setQuantity(3);

            store1.createProduct(product1);
            store1.createProduct(product2);
            store1.createProduct(product3);
            store1.createProduct(product4);
            store1.createProduct(product5);
            store1.createProduct(product6);
            store1.createProduct(product7);
            store1.createProduct(product8);
            store1.createProduct(product9);
            store1.createProduct(product10);

            //------------Store 2---------------//
            Store store2 = new Store();
            store2.setStoreName("Meny");
            store2.setAdresse("Østerfælled Torv 21");
            city1.createStore(store2);

            Product product11 = new Product();
            product11.setProductName("Deli Toast");
            product11.setProductPrice(18.95);
            product11.setDiscount(75);
            product11.setExpireDate(LocalDate.of(2020, 10, 2));
            product11.setQuantity(2);

            Product product12 = new Product();
            product12.setProductName("Gulerodsmix");
            product12.setProductPrice(20);
            product12.setDiscount(50);
            product12.setExpireDate(LocalDate.of(2020, 10, 4));
            product12.setReserved(true);
            product12.setQuantity(1);

            Product product13 = new Product();
            product13.setProductName("Blomkål");
            product13.setProductPrice(16.95);
            product13.setDiscount(60);
            product13.setExpireDate(LocalDate.of(2020, 10, 2));
            product13.setReserved(true);
            product13.setQuantity(4);

            Product product14 = new Product();
            product14.setProductName("Isberg salat");
            product14.setProductPrice(12);
            product14.setDiscount(60);
            product14.setExpireDate(LocalDate.of(2020, 10, 2));
            product14.setQuantity(7);

            Product product15 = new Product();
            product15.setProductName("Solsikke i Skiver");
            product15.setProductPrice(21.95);
            product15.setDiscount(60);
            product15.setExpireDate(LocalDate.of(2020, 10, 2));
            product15.setQuantity(9);

            Product product16 = new Product();
            product16.setProductName("Hakket Oksekød 0.8 kg");
            product16.setProductPrice(10);
            product16.setDiscount(60);
            product16.setExpireDate(LocalDate.of(2020, 10, 2));
            product16.setReserved(true);
            product16.setQuantity(2);

            Product product17 = new Product();
            product17.setProductName("Økologisk salatmix");
            product17.setProductPrice(10);
            product17.setDiscount(60);
            product17.setExpireDate(LocalDate.of(2020, 10, 2));
            product17.setReserved(true);
            product17.setQuantity(1);

            Product product18 = new Product();
            product18.setProductName("Hakket grisekød 0.4 kg");
            product18.setProductPrice(46.95);
            product18.setDiscount(60);
            product18.setExpireDate(LocalDate.of(2020, 10, 2));
            product18.setQuantity(6);

            Product product19 = new Product();
            product19.setProductName("Cherrytomater");
            product19.setProductPrice(55);
            product19.setDiscount(60);
            product19.setExpireDate(LocalDate.of(2020, 10, 2));
            product19.setReserved(true);
            product19.setQuantity(12);

            Product product20 = new Product();
            product20.setProductName("Hedebageres rugbrød");
            product20.setProductPrice(20);
            product20.setDiscount(70);
            product20.setExpireDate(LocalDate.of(2020, 10, 2));
            product20.setQuantity(5);

            store2.createProduct(product11);
            store2.createProduct(product12);
            store2.createProduct(product13);
            store2.createProduct(product14);
            store2.createProduct(product15);
            store2.createProduct(product16);
            store2.createProduct(product17);
            store2.createProduct(product18);
            store2.createProduct(product19);
            store2.createProduct(product20);

            //------------Store 3---------------//
            Store store3 = new Store();
            store3.setStoreName("Spar");
            store3.setAdresse("Støberigade");
            city1.createStore(store3);

            Product product21 = new Product();
            product21.setProductName("Æbler 1 kg");
            product21.setProductPrice(27);
            product21.setDiscount(75);
            product21.setExpireDate(LocalDate.of(2020, 10, 1));
            product21.setQuantity(6);

            Product product22 = new Product();
            product22.setProductName("Skagensbrød");
            product22.setProductPrice(19.95);
            product22.setDiscount(50);
            product22.setExpireDate(LocalDate.of(2020, 10, 4));
            product22.setReserved(true);
            product22.setQuantity(2);

            Product product23 = new Product();
            product23.setProductName("Jordbær");
            product23.setProductPrice(10);
            product23.setDiscount(60);
            product23.setExpireDate(LocalDate.of(2020, 10, 2));
            product23.setQuantity(8);

            Product product24 = new Product();
            product24.setProductName("Femkornsbrød");
            product24.setProductPrice(23.95);
            product24.setDiscount(60);
            product24.setExpireDate(LocalDate.of(2020, 10, 2));
            product24.setQuantity(1);

            Product product25 = new Product();
            product25.setProductName("Champignon");
            product25.setProductPrice(10);
            product25.setDiscount(60);
            product25.setExpireDate(LocalDate.of(2020, 10, 2));
            product25.setReserved(true);
            product25.setQuantity(8);

            Product product26 = new Product();
            product26.setProductName("Cherrytomater");
            product26.setProductPrice(10);
            product26.setDiscount(60);
            product26.setExpireDate(LocalDate.of(2020, 10, 2));
            product26.setReserved(true);
            product26.setQuantity(1);

            Product product27 = new Product();
            product27.setProductName("Økologisk salatmix");
            product27.setProductPrice(10);
            product27.setDiscount(60);
            product27.setExpireDate(LocalDate.of(2020, 10, 2));
            product27.setQuantity(4);

            Product product28 = new Product();
            product28.setProductName("Hakket grisekød 0.4 kg");
            product28.setProductPrice(46.95);
            product28.setDiscount(60);
            product28.setExpireDate(LocalDate.of(2020, 10, 2));
            product28.setQuantity(3);

            Product product29 = new Product();
            product29.setProductName("Hakket Oksekød 0.8 kg");
            product29.setProductPrice(55);
            product29.setDiscount(60);
            product29.setExpireDate(LocalDate.of(2020, 10, 2));
            product29.setReserved(true);
            product29.setQuantity(9);

            Product product30 = new Product();
            product30.setProductName("Stegeflæsk 0.4 kg");
            product30.setProductPrice(38.95);
            product30.setDiscount(60);
            product30.setExpireDate(LocalDate.of(2020, 10, 2));
            product30.setQuantity(2);

            store3.createProduct(product21);
            store3.createProduct(product22);
            store3.createProduct(product23);
            store3.createProduct(product24);
            store3.createProduct(product25);
            store3.createProduct(product26);
            store3.createProduct(product27);
            store3.createProduct(product28);
            store3.createProduct(product29);
            store3.createProduct(product30);

            //------------Store 4---------------//
            Store store4 = new Store();
            store4.setStoreName("Rema 1000");
            store4.setAdresse("Hammerichsgade 1");
            city1.createStore(store4);

            Product product31 = new Product();
            product31.setProductName("Æbler 1 kg");
            product31.setProductPrice(27);
            product31.setDiscount(75);
            product31.setExpireDate(LocalDate.of(2020, 10, 1));
            product31.setReserved(false);
            product31.setQuantity(4);

            Product product32 = new Product();
            product32.setProductName("Røget laks");
            product32.setProductPrice(20);
            product32.setDiscount(50);
            product32.setExpireDate(LocalDate.of(2020, 10, 4));
            product32.setQuantity(7);

            Product product33 = new Product();
            product33.setProductName("Skagens rejer");
            product33.setProductPrice(61.95);
            product33.setDiscount(60);
            product33.setExpireDate(LocalDate.of(2020, 10, 2));
            product33.setReserved(true);
            product33.setQuantity(2);

            Product product34 = new Product();
            product34.setProductName("Advocado");
            product34.setProductPrice(35);
            product34.setDiscount(60);
            product34.setExpireDate(LocalDate.of(2020, 10, 2));
            product34.setQuantity(1);

            Product product35 = new Product();
            product35.setProductName("Champignon");
            product35.setProductPrice(10);
            product35.setDiscount(60);
            product35.setExpireDate(LocalDate.of(2020, 10, 2));
            product35.setReserved(true);
            product35.setQuantity(1);

            Product product36 = new Product();
            product36.setProductName("Fiskefars 0.4 kg");
            product36.setProductPrice(38);
            product36.setDiscount(60);
            product36.setExpireDate(LocalDate.of(2020, 10, 2));
            product36.setReserved(true);
            product36.setQuantity(8);

            Product product37 = new Product();
            product37.setProductName("Økologisk salatmix");
            product37.setProductPrice(10);
            product37.setDiscount(60);
            product37.setExpireDate(LocalDate.of(2020, 10, 2));
            product37.setQuantity(1);

            Product product38 = new Product();
            product38.setProductName("Mælk");
            product38.setProductPrice(46.95);
            product38.setDiscount(60);
            product38.setExpireDate(LocalDate.of(2020, 10, 2));
            product38.setQuantity(2);

            Product product39 = new Product();
            product39.setProductName("Blandet salat");
            product39.setProductPrice(10);
            product39.setDiscount(60);
            product39.setExpireDate(LocalDate.of(2020, 10, 2));
            product39.setQuantity(6);


            Product product40 = new Product();
            product40.setProductName("Solsikkeboller");
            product40.setProductPrice(22.95);
            product40.setDiscount(60);
            product40.setExpireDate(LocalDate.of(2020, 10, 2));
            product40.setQuantity(1);

            store4.createProduct(product31);
            store4.createProduct(product32);
            store4.createProduct(product33);
            store4.createProduct(product34);
            store4.createProduct(product35);
            store4.createProduct(product36);
            store4.createProduct(product37);
            store4.createProduct(product38);
            store4.createProduct(product39);
            store4.createProduct(product40);


            //--------------City 2------------------//
            City city2 = new City();
            city2.setCityName("Roskilde");
            cities.add(city2);

            //-----------------Store 1--------------------//
            Store store5 = new Store();
            store5.setStoreName("Min Købmand");
            store5.setAdresse("Kongebakken 5");
            city2.createStore(store5);

            Product product41 = new Product();
            product41.setProductName("Kylligesalat");
            product41.setProductPrice(18.95);
            product41.setDiscount(75);
            product41.setExpireDate(LocalDate.of(2020, 10, 1));
            product41.setReserved(false);
            product41.setQuantity(6);

            Product product42 = new Product();
            product42.setProductName("Mælk");
            product42.setProductPrice(20);
            product42.setDiscount(50);
            product42.setExpireDate(LocalDate.of(2020, 10, 4));
            product42.setReserved(true);
            product42.setQuantity(2);

            Product product43 = new Product();
            product43.setProductName("Hamburgerryg");
            product43.setProductPrice(12);
            product43.setDiscount(80);
            product43.setExpireDate(LocalDate.of(2020, 10, 2));
            product43.setQuantity(8);

            Product product44 = new Product();
            product44.setProductName("Advocado");
            product44.setProductPrice(35);
            product44.setDiscount(60);
            product44.setExpireDate(LocalDate.of(2020, 10, 2));
            product44.setQuantity(1);

            Product product45 = new Product();
            product45.setProductName("Skinke");
            product45.setProductPrice(20.75);
            product45.setDiscount(60);
            product45.setExpireDate(LocalDate.of(2020, 10, 2));

            Product product46 = new Product();
            product46.setProductName("Cherrytomater");
            product46.setProductPrice(10);
            product46.setDiscount(60);
            product46.setExpireDate(LocalDate.of(2020, 10, 2));
            product46.setReserved(true);

            Product product47 = new Product();
            product47.setProductName("Gravad laks");
            product47.setProductPrice(32);
            product47.setDiscount(60);
            product47.setExpireDate(LocalDate.of(2020, 10, 2));
            product47.setReserved(true);
            product47.setQuantity(4);

            Product product48 = new Product();
            product48.setProductName("Hakket grisekød 0.4 kg");
            product48.setProductPrice(46.95);
            product48.setDiscount(60);
            product48.setExpireDate(LocalDate.of(2020, 10, 2));
            product48.setQuantity(5);

            Product product49 = new Product();
            product49.setProductName("Æggesalat");
            product49.setProductPrice(23.95);
            product49.setDiscount(60);
            product49.setExpireDate(LocalDate.of(2020, 10, 2));
            product49.setReserved(true);
            product49.setQuantity(3);

            Product product50 = new Product();
            product50.setProductName("Stegeflæsk 0.4 kg");
            product50.setProductPrice(38.95);
            product50.setDiscount(60);
            product50.setExpireDate(LocalDate.of(2020, 10, 2));
            product50.setQuantity(6);

            store5.createProduct(product41);
            store5.createProduct(product42);
            store5.createProduct(product43);
            store5.createProduct(product44);
            store5.createProduct(product45);
            store5.createProduct(product46);
            store5.createProduct(product47);
            store5.createProduct(product48);
            store5.createProduct(product49);
            store5.createProduct(product50);

            //----------------Store 2-------------------//
            Store store6 = new Store();
            store6.setStoreName("Aldi");
            store6.setAdresse("Søndre Ringvej 24 A");
            city2.createStore(store6);

            Product product51 = new Product();
            product51.setProductName("Roastbeef");
            product51.setProductPrice(20);
            product51.setDiscount(75);
            product51.setExpireDate(LocalDate.of(2020, 10, 1));
            product51.setReserved(false);
            product51.setQuantity(10);

            Product product52 = new Product();
            product52.setProductName("Mælk");
            product52.setProductPrice(20);
            product52.setDiscount(50);
            product52.setExpireDate(LocalDate.of(2020, 10, 4));
            product52.setReserved(true);
            product52.setQuantity(2);

            Product product53 = new Product();
            product53.setProductName("Røget mørbrad");
            product53.setProductPrice(35);
            product53.setDiscount(60);
            product53.setExpireDate(LocalDate.of(2020, 10, 2));
            product53.setReserved(true);
            product53.setQuantity(4);

            Product product54 = new Product();
            product54.setProductName("Advocado");
            product54.setProductPrice(35);
            product54.setDiscount(60);
            product54.setExpireDate(LocalDate.of(2020, 10, 2));
            product54.setReserved(true);
            product54.setQuantity(8);

            Product product55 = new Product();
            product55.setProductName("Courgette");
            product55.setProductPrice(8.95);
            product55.setDiscount(60);
            product55.setExpireDate(LocalDate.of(2020, 10, 2));
            product55.setReserved(true);
            product55.setQuantity(2);

            Product product56 = new Product();
            product56.setProductName("Cherrytomater");
            product56.setProductPrice(10);
            product56.setDiscount(60);
            product56.setExpireDate(LocalDate.of(2020, 10, 2));
            product56.setReserved(true);
            product56.setQuantity(1);

            Product product57 = new Product();
            product57.setProductName("Økologisk salatmix");
            product57.setProductPrice(10);
            product57.setDiscount(60);
            product57.setExpireDate(LocalDate.of(2020, 10, 2));
            product57.setReserved(true);
            product57.setQuantity(2);

            Product product58 = new Product();
            product58.setProductName("Isberg salat");
            product58.setProductPrice(46.95);
            product58.setDiscount(60);
            product58.setExpireDate(LocalDate.of(2020, 10, 2));
            product58.setQuantity(6);

            Product product59 = new Product();
            product59.setProductName("Hakket Oksekød 0.8 kg");
            product59.setProductPrice(55);
            product59.setDiscount(60);
            product59.setExpireDate(LocalDate.of(2020, 10, 2));
            product59.setReserved(true);
            product59.setQuantity(5);

            Product product60 = new Product();
            product60.setProductName("Røde vindruer");
            product60.setProductPrice(20);
            product60.setDiscount(60);
            product60.setExpireDate(LocalDate.of(2020, 10, 2));
            product60.setQuantity(3);

            store6.createProduct(product51);
            store6.createProduct(product52);
            store6.createProduct(product53);
            store6.createProduct(product54);
            store6.createProduct(product55);
            store6.createProduct(product56);
            store6.createProduct(product57);
            store6.createProduct(product58);
            store6.createProduct(product59);
            store6.createProduct(product60);
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
