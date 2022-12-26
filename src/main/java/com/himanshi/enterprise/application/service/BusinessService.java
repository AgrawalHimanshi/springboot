package com.himanshi.enterprise.application.service;


import com.himanshi.enterprise.application.data.DataLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    DataLayer data;
    public long calculateSum(){

        List<Integer> input = data.getData();

        return  input.stream().reduce(
                Integer::sum
        ).get()*100;

    }
}