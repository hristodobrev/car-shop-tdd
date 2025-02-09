package org.example.services;

import org.example.models.User;
import org.example.repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public User get(int id) {
        return this.userRepository.get(id);
    }
}
