package org.example.repositories;

import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final ArrayList<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("John", "123456"));
    }

    public User get(int id) {
        return users.get(id);
    }

    public List<User> getAll() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
