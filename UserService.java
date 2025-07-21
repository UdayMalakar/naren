package com.example.practice.services;

import com.example.practice.repositry.UserRepo;
import com.example.practice.entity.User;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; // ✅ Required
import org.springframework.stereotype.Service; // ✅ Required

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    // Create or Update user
    public User saveUser(User user) {
        return userRepository.save(user); // create or update
    }

    // Find user by ID

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Find all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Find by username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
