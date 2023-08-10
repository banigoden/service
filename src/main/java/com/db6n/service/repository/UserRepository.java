package com.db6n.service.repository;

import com.db6n.service.model.domain.User;
import com.db6n.service.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    User findById(long userId);
    List<UserEntity> findByName(String name);
}
