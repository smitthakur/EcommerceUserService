package com.blackbucks.UserService.controllers;

import com.blackbucks.UserService.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping()
    public ResponseEntity createUser(@RequestBody User user){
        return null;
    }
}
