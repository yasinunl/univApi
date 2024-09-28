package org.example.univ.controller;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Section;
import org.example.univ.entity.User;
import org.example.univ.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @GetMapping
    ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUser());
    }
    @PostMapping("/login")
    ResponseEntity<User> login(@RequestParam String pass){
        return ResponseEntity.ok(userService.login(pass));
    }
}
