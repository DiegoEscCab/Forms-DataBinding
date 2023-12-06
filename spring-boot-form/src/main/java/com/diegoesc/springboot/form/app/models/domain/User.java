package com.diegoesc.springboot.form.app.models.domain;

import com.diegoesc.springboot.form.app.validation.RegexIdentification;
import jakarta.validation.constraints.*;

public class User {
    //@Pattern(regexp = "[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
    @RegexIdentification
    private String id;
    //@NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    @NotBlank
    @Size(min = 3, max = 10)
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
