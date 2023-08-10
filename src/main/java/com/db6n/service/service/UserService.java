package com.db6n.service.service;

import com.db6n.service.model.entity.UserEntity;
import com.db6n.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity createOrUpdateUser(UserEntity user) {
        return userRepository.save(user);
    }

    public Optional<UserEntity> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public List<UserEntity> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
