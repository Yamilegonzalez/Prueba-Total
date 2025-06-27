package com.total.user.Users.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/")
    public Map<String, String> getProducts() {
        return Map.of("message", "Hola Mundo desde UserController Service");
    }
}