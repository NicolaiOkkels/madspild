package com.example.demo.controller;

import com.example.demo.model.Cities;
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

    private Cities cities = new Cities();
    private ArrayList<City> citiesList = cities.generateCities();

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
        if(citiesList.get(0).getCityName().equalsIgnoreCase(cityName)){
            ArrayList<Store> kbhStore = citiesList.get(0).getStores();
            model.addAttribute("city", cityName);
            model.addAttribute("stores", kbhStore);
            return "butikker";
        } else if(citiesList.get(1).getCityName().equalsIgnoreCase(cityName)){
            ArrayList<Store> roskildeStore = citiesList.get(1).getStores();
            model.addAttribute("city", cityName);
            model.addAttribute("stores", roskildeStore);
            return "butikker";
        }
        return "fejlside";
    }

    @PostMapping("/varer")
    public String products(@RequestParam("butik")String storeName,  Model model){
        if(citiesList.get(0).getCityName().equals("København NV") && citiesList.get(0).getStores().get(0).getStoreName().equals(storeName)){
            ArrayList<Product> productList = citiesList.get(0).getStores().get(0).getStoreProducts();
            model.addAttribute("products", productList);
        }else if(citiesList.get(0).getCityName().equals("København NV") && citiesList.get(0).getStores().get(1).getStoreName().equals(storeName)){
            ArrayList<Product> productList = citiesList.get(0).getStores().get(1).getStoreProducts();
            model.addAttribute("products", productList);
        }else if(citiesList.get(0).getCityName().equals("København NV") && citiesList.get(0).getStores().get(2).getStoreName().equals(storeName)){
            ArrayList<Product> productList = citiesList.get(0).getStores().get(2).getStoreProducts();
            model.addAttribute("products", productList);
        }
        return "varer";
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
