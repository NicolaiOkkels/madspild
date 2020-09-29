package com.example.demo.controller;

import com.example.demo.data.CitiesData;
import com.example.demo.model.City;
import com.example.demo.model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/forbruger")
    public String user(){
        return "forbruger";
    }

    @PostMapping("/butikker")
    public String storesInYourCity(Model model){
        model.addAttribute("cities", CitiesData.generateCities());
        return "butikker";
    }

    @GetMapping("/kontakt")
    public String contact(){
        return "kontakt";
    }

    @GetMapping("/læs mere")
    public String readMore(){
        return "læs-mere";
    }

    @GetMapping("/samarbejdspartnere")
    public String partner(){
        return "samarbejdspartnere";
    }
}
