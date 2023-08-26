package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
@SessionScope
public class Store {

 private final List<Integer[]> items = new ArrayList<>();

 public void add(Integer[] ids){
  for (Integer id : ids){
   items.add(ids);
  }
 }

 public List<Integer[]> getAll(){
  return Collections.unmodifiableList(items);
 }
 }
