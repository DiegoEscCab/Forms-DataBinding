package com.diegoesc.springboot.form.app.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class Validation implements ConstraintValidator<RegexIdentification, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.matches("[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")){
            return true;
        }
        return false;
    }
}
