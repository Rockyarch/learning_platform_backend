package com.epravidi.Courses.api.services;


import org.springframework.stereotype.Service;

import com.epravidi.Courses.api.entities.User;
import com.epravidi.Courses.api.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        System.out.println("User repository created from service");
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        System.out.println("Creating user in service layer");
        return userRepository.save(user);

    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
