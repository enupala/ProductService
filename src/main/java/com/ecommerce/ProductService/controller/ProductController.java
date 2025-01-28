package com.ecommerce.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/products")
    public String getProduct(){
        return "product is running on this port "+port;
    }

}
