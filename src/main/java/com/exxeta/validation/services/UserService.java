package com.exxeta.validation.services;

import com.exxeta.validation.io.entities.User;
import com.exxeta.validation.io.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        return this.userRepository.save(user);
    }
}
