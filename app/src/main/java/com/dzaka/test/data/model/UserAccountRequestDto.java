package com.dzaka.test.data.model;

public class UserAccountRequestDto {

    public String username;
    public String password;
    public String email;

    public UserAccountRequestDto(String userName, String password, String email) {
        this.username = userName;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
