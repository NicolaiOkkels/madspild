package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/forbruger")
    public String user(){
        return "forbruger";
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
