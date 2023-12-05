package com.diegoesc.springboot.form.app.models.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    @NotEmpty
    @Size(min = 3, max = 25)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    @Email
    private String email;
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
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
