package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Configuration
public class StoreService {

    ArrayList items = new ArrayList<>();

    public  addProduct(ProductId id) {
if (ProductId.isEmpty())
    return false;
if (ProductId.containts(id))
    return Id;
    }

    public getProduct(ProductId id) {
        ProductId.containts(id);

        return ProductId;

    }
}


