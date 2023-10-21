package com.project.service.api.controller;


import com.project.db.user.User;
import com.project.service.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    private final UserRepository userRepository;
//
    @GetMapping
    public void asdads() {

        System.out.println("asdasdsad");
        List<User> a = userRepository.findAll();
        for (User user : a) {
            System.out.println(user);
        }
    }
}