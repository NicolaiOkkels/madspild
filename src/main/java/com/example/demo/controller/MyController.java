package com.example.demo.controller;

import com.example.demo.data.CitiesData;
import com.example.demo.model.City;
import com.example.demo.model.Product;
import com.example.demo.model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MyController {

    private CitiesData data = new CitiesData();
    private ArrayList<City> cities = data.generateCities();

    @GetMapping("/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/forbruger")
    public String user(){
        return "forbruger";
    }

    @PostMapping("/butikker")
    public String storesInYourCity(@RequestParam("by") String cityName, Model model){
        if(cities.get(0).getCityName().equals(cityName)){
            ArrayList<Store> kbhStore = cities.get(0).getStores();
            model.addAttribute("stores", kbhStore);
        } else if(cities.get(1).getCityName().equals(cityName)){
            ArrayList<Store> roskildeStore = cities.get(1).getStores();
            model.addAttribute("stores", roskildeStore);
        }
        return "butikker";
    }

    @PostMapping("/vare")
    public String products(@RequestParam("butik")String storeName, Model model){
        if(cities.get(0).getCityName().equals("København NV") && cities.get(0).getStores().get(0).getStoreName().equals(storeName)){
            ArrayList<Product> productList = cities.get(0).getStores().get(0).getStoreProducts();
            model.addAttribute("products", productList);
        }
        return "vare";
    }

    @GetMapping("/butikker")
    public String redirectToUser(){
        return "redirect:/forbruger";
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
