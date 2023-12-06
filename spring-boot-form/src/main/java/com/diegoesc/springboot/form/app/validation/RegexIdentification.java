package com.diegoesc.springboot.form.app.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Constraint(validatedBy = Validation.class)
@Retention(RUNTIME)
@Target({ElementType.FIELD, METHOD})
public @interface RegexIdentification {
    String message() default "Invalid ID";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
