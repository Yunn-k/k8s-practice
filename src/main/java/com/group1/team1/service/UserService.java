package com.group1.team1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.group1.team1.entity.User;
import com.group1.team1.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() { // 모든 사용자 조회
        return userRepository.findAll();
    }

    public User createUser(User user) { // 사용자 저장
        return userRepository.save(user);
    }

}
