package com.auth.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.entity.User;
import com.auth.security.UserService;
import com.auth.user.repository.UserRepository;

/**
 * Mock implementation.
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
@Service
public class DatabaseUserService implements UserService {
	private final UserRepository userRepository;
    
    @Autowired
    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}