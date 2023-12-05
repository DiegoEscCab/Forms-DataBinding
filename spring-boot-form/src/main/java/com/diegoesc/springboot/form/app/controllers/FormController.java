package com.diegoesc.springboot.form.app.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.diegoesc.springboot.form.app.models.domain.User;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        User user = new User();
        model.addAttribute("title", "User form");
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/form")
    public String process(@Valid User user,
                          BindingResult result,
                          Model model) {
        model.addAttribute("title", "Form submitted");

        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            result.getFieldErrors().forEach(err -> {
                errors.put(err.getField(), "The space ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
            });
            model.addAttribute("error",errors);
            return "form";
        }

        model.addAttribute("user", user);

        return "processed";
    }

}
