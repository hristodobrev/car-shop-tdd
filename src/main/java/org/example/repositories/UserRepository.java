package org.example.repositories;

import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getAll() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John", "123456"));

        return users;
    }
}
