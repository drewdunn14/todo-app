package com.tnd.model;

public class User {

    private int id;
    private String username;
    private String password;


    public User(int idIn, String usernameIn, String passwordIn) {
        this.setId(idIn);
        this.setUsername(usernameIn);
        this.setPassword(passwordIn);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPassword(String passwordIn) {
        this.password = passwordIn;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Username: \nPassword: ");
        result.insert(9, this.username);
        result.append(this.password);

        return "";
    }
}