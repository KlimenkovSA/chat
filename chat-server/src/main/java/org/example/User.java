package org.example;

public class User {
    private final String login;
    private final String password;
    private  final String username;
    private final String role; // USER, ADMIN

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() { return role; }

    public User(String login, String password, String role, String username) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.username = username;
    }
}