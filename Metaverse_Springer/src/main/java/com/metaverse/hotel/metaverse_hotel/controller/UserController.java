package com.metaverse.hotel.metaverse_hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metaverse.hotel.metaverse_hotel.model.UserRepository;

import com.metaverse.hotel.metaverse_hotel.model.User;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepo;

    @GetMapping("/userlist")

    public List<User> listofUser() {
        return userRepo.findAll();
    }

}
