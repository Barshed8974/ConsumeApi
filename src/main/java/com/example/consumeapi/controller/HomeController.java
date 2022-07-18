package com.example.consumeapi.controller;

import com.example.consumeapi.User;
import com.example.consumeapi.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ServiceLayer serviceLayer;

    @Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/get")
    public ResponseEntity<User> getData()
    {
        return new ResponseEntity<>(serviceLayer.consumeApi(), HttpStatus.OK);
    }
}
