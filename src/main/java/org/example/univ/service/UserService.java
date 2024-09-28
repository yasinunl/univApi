package org.example.univ.service;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Section;
import org.example.univ.entity.User;
import org.example.univ.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepo userRepo;
    public List<User> getAllUser(){
        return userRepo.findAll();
    }
    public User login(String pass){
        return userRepo.findByPassword(pass).orElseThrow();
    }
}
