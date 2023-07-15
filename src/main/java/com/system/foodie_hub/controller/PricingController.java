package com.system.foodie_hub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PricingController {
    @GetMapping("/pricing")
    public String getPricingPage(){
        return "pricing.html";
    }


    @GetMapping("/book-now")
    public String getBookPage(){
        return "booknow.html";
    }


}


