package com.diegoesc.springboot.form.app.services;

import com.diegoesc.springboot.form.app.models.domain.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ServiceCountryImp implements ServiceCountry{
    private List<Country> list;
    public ServiceCountryImp() {
        this.list = Arrays.asList(
                new Country(1,"MX","Mexico"),
                new Country(2,"US","United States of America"),
                new Country(3,"CL","Chile"),
                new Country(4,"AR","Argentina"),
                new Country(5,"CO","Colombia"),
                new Country(6,"IT","Italy"),
                new Country(7,"PT","Portugal"));
    }

    @Override
    public List<Country> list() {
        return list;
    }

    @Override
    public Country getById(Integer id) {
        Country result = null;
        for(Country country: this.list){
            if (id == country.getId()){
                result = country;
                break;
            }
        }
        return result;
    }
}
