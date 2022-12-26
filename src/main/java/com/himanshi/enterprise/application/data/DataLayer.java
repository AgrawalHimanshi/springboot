package com.himanshi.enterprise.application.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLayer {
    public List<Integer> getData(){
        return  List.of(1,2,3,4,5);
    }
}