package com.diegoesc.springboot.form.app.services;

import com.diegoesc.springboot.form.app.models.domain.Country;

import java.util.List;

public interface ServiceCountry {

    public List<Country> list();
    public Country getById(Integer id);

}
