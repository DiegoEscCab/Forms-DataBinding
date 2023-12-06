package com.diegoesc.springboot.form.app.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidationRequired implements ConstraintValidator<Required, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.isEmpty() || value.isBlank()){
            return false;
        }
        return true;
    }
}
