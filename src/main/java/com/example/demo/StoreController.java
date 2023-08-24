package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class StoreController {

    @RequestMapping("/store/order/add")
    public Product add(@RequestParam int ProductId){

        StoreService.addProduct;

        return ProductId();
    }

    @RequestMapping("/store/order/get")
    public Product get(@RequestParam int ProductId){

        return ProductId();
    }


 }
