package com.example.demo.Servise;

import com.example.demo.Model.User;
import com.example.demo.Repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositry userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
