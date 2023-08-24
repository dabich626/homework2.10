package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
@Scope("prototype")
public class ProductId extends  StoreService{

    private final int id;
    private final int id2;

    private final int id3;

    private final int id4;




    public ProductId(int id, int id2, int id3, int id4) {
        this.id = id;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
    }

    @Bean
    public ProductId random() {

        items.add(626, 444, 866, 234);

        return new ProductId(626, 444, 866, 234);
    }



 }
