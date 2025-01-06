package com.metlife.user.controller;

import com.metlife.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/get-all-users")
    public List<String> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get-menu")
    public List<String> getMenu() {
        return userService.getMenu();
    }
}
