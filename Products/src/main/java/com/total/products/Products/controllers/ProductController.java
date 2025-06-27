package com.total.products.Products.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    public String getProducts() {
        return "Hola Mundo desde Product Service";
    }
}