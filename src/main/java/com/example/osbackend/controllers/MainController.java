package com.example.osbackend.controllers;

import com.example.osbackend.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    User user = new User();

    @GetMapping("/")
    public User greeting() {
        user.username = "Raslan";
        user.password = "Ismail";
        return user;
    }
}
