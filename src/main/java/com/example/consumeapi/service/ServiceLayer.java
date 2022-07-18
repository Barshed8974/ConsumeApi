package com.example.consumeapi.service;


import com.example.consumeapi.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {

    private final RestTemplate restTemplate;

    @Autowired
    public ServiceLayer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User consumeApi()
    {
        return restTemplate.getForObject("https://625e56d83b039517f1f3cbac.mockapi.io/api/v1/ccdata/credit", User.class);
    }
}
