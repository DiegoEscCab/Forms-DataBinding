package com.diegoesc.springboot.form.app.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = ValidationRequired.class)
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface Required {
    String message() default "Last Name field is required";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
