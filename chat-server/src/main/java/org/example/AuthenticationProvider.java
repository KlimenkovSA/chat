package org.example;

public interface AuthenticationProvider {
    String getUsernameByLoginAndPassword(String login, String password);

    boolean register(String login, String password, String nick, String role);

    String getRoleByUsername(String username);
}