package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/store/order/")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @RequestMapping("/store/order/add")
    public void add(@RequestParam Integer[] ids){

        storeService.add(ids);
    }

    @RequestMapping("/store/order/get")
    public List<Integer[]> get(){

return storeService.all();
    }


 }
