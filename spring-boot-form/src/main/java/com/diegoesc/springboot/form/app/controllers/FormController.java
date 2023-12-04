package com.diegoesc.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.diegoesc.springboot.form.app.models.domain.User;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("title", "User form");
        return "form";
    }

    @PostMapping("/form")
    public String process(User user,
                          Model model
    ){
        model.addAttribute("title", "Form submitted");
        model.addAttribute("user",user);

        return "processed";
    }

}
