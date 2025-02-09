package org.example.models;

import java.util.List;

public class User {
    private String name;
    private String username;
    private String password;
    private String email;
    private List<Ad> ads;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public User(String username, String password, String email, String name) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setName(name);
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
