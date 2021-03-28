package com.exxeta.validation.ui.controllers;

import com.exxeta.validation.io.entities.User;
import com.exxeta.validation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return  this.userService.save(user);
    }
}
