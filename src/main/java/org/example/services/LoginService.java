package org.example.services;

import org.example.models.User;
import org.example.repositories.UserRepository;

import java.util.List;

public class LoginService {
    private final UserRepository userRepository = new UserRepository();

    public String login(String username, String password) {
        List<User> users = this.userRepository.getAll();
        String message = "Incorrect username or password!";

        if (users.stream().anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password))) {
            message = "Successfully logged in!";
        }

        return message;
    }
}
