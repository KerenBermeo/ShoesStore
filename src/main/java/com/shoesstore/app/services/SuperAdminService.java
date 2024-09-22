package com.shoesstore.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesstore.app.models.User;
import com.shoesstore.app.repository.UserRepository;

@Service
public class SuperAdminService {
    @Autowired
    private UserRepository userRepository;

    public User createAdmin(User user) {
        return userRepository.save(user);
    }

    public void activateDeactivateAdmin(int adminId, boolean isActive) {
        User admin = userRepository.findById(adminId).orElseThrow(() -> new RuntimeException("Admin not found"));
        admin.setStatus(isActive);
        userRepository.save(admin);
    }
}
