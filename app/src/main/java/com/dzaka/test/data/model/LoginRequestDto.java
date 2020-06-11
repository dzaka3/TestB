package com.dzaka.test.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoginRequestDto {

    private String username;
    private String password;

    public LoginRequestDto(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
