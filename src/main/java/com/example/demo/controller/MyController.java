package com.example.demo.controller;

import com.example.demo.model.Cities;
import com.example.demo.model.City;
import com.example.demo.model.Product;
import com.example.demo.model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MyController {

    private Cities cities = new Cities();
    private ArrayList<City> citiesList = cities.buildCities();

    @GetMapping("/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/forbruger")
    public String user(){
        return "forbruger";
    }

    @GetMapping("/butikker")
    public String storesInYourCity(@RequestParam("by") String cityName, Model model){
        if(citiesList.get(cities.getCitiesIndex(cityName)).getCityName().equalsIgnoreCase(cityName)){
            ArrayList<Store> kbhStore = citiesList.get(cities.getCitiesIndex(cityName)).getStores();
            model.addAttribute("city", cities.ignoreCase(cityName));
            model.addAttribute("stores", kbhStore);
            return "butikker";
        } else if(citiesList.get(cities.getCitiesIndex(cityName)).getCityName().equalsIgnoreCase(cityName)){
            ArrayList<Store> roskildeStore = citiesList.get(cities.getCitiesIndex(cityName)).getStores();
            model.addAttribute("city", cities.ignoreCase(cityName));
            model.addAttribute("stores", roskildeStore);
            return "butikker";
        }
        return "fejlside";
    }

    @GetMapping("/varer")
    public String products(@RequestParam("by")String cityName, @RequestParam("butik")String storeName, Model model){
        if(citiesList.get(cities.getCitiesIndex(cityName)).getCityName().equals(cityName) && citiesList.get(cities.getCitiesIndex(cityName)).getStores().get(citiesList.get(cities.getCitiesIndex(cityName)).getStoreIndex(storeName)).getStoreName().equalsIgnoreCase(storeName)){
            ArrayList<Product> productList = citiesList.get(cities.getCitiesIndex(cityName)).getStores().get(citiesList.get(cities.getCitiesIndex(cityName)).getStoreIndex(storeName)).getStoreProducts();
            model.addAttribute("city", cities.ignoreCase(cityName));
            model.addAttribute("products", productList);
        }
        return "varer";
    }
    
    @GetMapping("/kontakt")
    public String contact(){
        return "kontakt";
    }

    @GetMapping("/læs-mere")
    public String readMore(){
        return "læs-mere";
    }

    @GetMapping("/samarbejdspartnere")
    public String partner(){
        return "samarbejdspartnere";
    }
}