package org.example.services;

import org.example.models.User;
import org.example.repositories.UserRepository;

public class RegisterService {
    private final UserRepository userRepository = new UserRepository();

    public String register(String username, String password, String confirmPassword, String name, String email) {
        if (password.isBlank()) {
            return "Password is required!";
        }

        if (confirmPassword.isBlank()) {
            return "Confirm password is required!";
        }

        if (!password.equals(confirmPassword)) {
            return "Password and confirm password do not match!";
        }

        if (password.length() < 8 || password.length() > 30) {
            return "Password must be between 8 and 30 characters!";
        }

        if (username.isBlank()) {
            return "Username is required!";
        }

        if (username.length() < 3 || username.length() > 20) {
            return "Username must be between 3 and 20 characters!";
        }

        if (email.isBlank()) {
            return "Email is required!";
        }

        if (!email.contains("@")) {
            return "Email is invalid!";
        }

        this.userRepository.addUser(new User(username, password, email, name));

        if (this.userRepository.getAll().stream().anyMatch(user ->
                user.getUsername().equals(username) &&
                        user.getPassword().equals(password) &&
                        user.getEmail().equals(email) &&
                        user.getName().equals(name)
        )) {
            return "User registered successfully!";
        }

        return "User could not be registered!";
    }
}
