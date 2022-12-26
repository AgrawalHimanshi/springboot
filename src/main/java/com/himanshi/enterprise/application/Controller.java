package com.himanshi.enterprise.application;

import com.himanshi.enterprise.application.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    BusinessService service;
    @GetMapping("/sum")
    public long displaySum(){
        return service.calculateSum();
    }
}




