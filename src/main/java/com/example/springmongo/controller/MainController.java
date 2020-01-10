package com.example.springmongo.controller;

import com.example.springmongo.domain.User;
import com.example.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private UserRepository repository;

    @Autowired
    public MainController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/api/user")
    public User create(@RequestParam String name) {
        return repository.save(new User(name));
    }
}
