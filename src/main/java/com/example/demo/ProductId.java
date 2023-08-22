package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductId  {

    private final int id;


    public ProductId(int id) {
        this.id = id;
    }

    @Bean
    public ProductId random() {

        return new ProductId(626);
    }

}
