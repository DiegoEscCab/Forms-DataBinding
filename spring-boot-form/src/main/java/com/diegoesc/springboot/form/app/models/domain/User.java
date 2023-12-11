package com.diegoesc.springboot.form.app.models.domain;

import com.diegoesc.springboot.form.app.validation.RegexIdentification;
import com.diegoesc.springboot.form.app.validation.Required;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    //@Pattern(regexp = "[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
    @RegexIdentification
    private String id;
    //@NotEmpty
    private String name;
    @Required
    private String lastName;
    @NotBlank
    @Size(min = 3, max = 10)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    @Email
    private String email;
    @NotNull
    @Min(5)
    @Max(10)
    private  Integer account;
    @NotNull
    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    @NotEmpty
    private String country;
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
    public Integer getAccount() { return account; }
    public void setAccount(Integer account) { this.account = account; }
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
