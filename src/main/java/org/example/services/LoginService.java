package org.example.services;

import org.example.models.User;
import org.example.repositories.UserRepository;

import java.util.List;

public class LoginService {
    public String login(String username, String password) {
        List<User> users = UserRepository.getAll();
        String message = "Incorrect username or password!";

        if(users.stream().anyMatch(u -> u.getName().equals(username) && u.getPassword().equals(password))) {
            message = "Successfully logged in!";
        }

        return message;
    }
}
