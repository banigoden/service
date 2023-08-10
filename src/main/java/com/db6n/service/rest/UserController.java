package com.db6n.service.rest;

import com.db6n.service.model.entity.NoteEntity;
import com.db6n.service.model.entity.UserEntity;
import com.db6n.service.repository.UserRepository;
import com.db6n.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createOrUpdateUser(user);
    }

    @GetMapping("{userId}")
    public Optional<UserEntity> getUser(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    public UserEntity updateUser(@PathVariable("userId") Long userId, @RequestBody UserEntity user){
        user.setUserId(userId);
        return userService.createOrUpdateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

    @GetMapping("/name/{name}")
    public List<UserEntity> getUsersByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }

}
