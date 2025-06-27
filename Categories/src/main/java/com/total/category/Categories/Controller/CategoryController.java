package com.total.category.Categories.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @GetMapping("/")
    public Map<String, String> getCategories() {
        return Map.of("message", "Hola Mundo desde Categories Service");
    }
}
