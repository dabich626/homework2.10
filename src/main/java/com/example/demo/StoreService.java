package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configuration
public class StoreService {

    public StoreService(Store store) {
        this.store = store;
    }

    private final Store store;

    public void add(Integer[] ids) {
        store.add(ids);
    }

    public List<Integer[]> all() {

        return store.getAll();

    }



}


