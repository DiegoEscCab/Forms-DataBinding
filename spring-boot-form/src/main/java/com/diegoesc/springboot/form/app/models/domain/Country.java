package com.diegoesc.springboot.form.app.models.domain;

import jakarta.validation.constraints.NotNull;

public class Country {
    @NotNull
    private Integer Id;
    private String code;
    private String name;

    public Country() {
    }
    public Country(Integer id, String code, String name) {
        this.Id = id;
        this.code = code;
        this.name = name;
    }
    public Integer getId() { return Id; }
    public void setId(Integer id) { Id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
