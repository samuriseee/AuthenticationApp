package com.example.authenticationapp;

public class User {
    private String firstName,lastName;
    private String email;
    private String password;

    public User(String lastName,String firstName, String email, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
