package com.diegoesc.springboot.form.app.controllers;

import com.diegoesc.springboot.form.app.editors.EditorCapsName;
import com.diegoesc.springboot.form.app.models.domain.Country;
import com.diegoesc.springboot.form.app.services.ServiceCountry;
import com.diegoesc.springboot.form.app.validation.ValidationUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.diegoesc.springboot.form.app.models.domain.User;
import org.springframework.web.bind.support.SessionStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("user")
public class FormController {
    @Autowired
    private ValidationUser validation;
    @Autowired
    private ServiceCountry serviceCountry;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(validation);

        binder.registerCustomEditor(String.class, "name", new EditorCapsName());
    }

    @GetMapping("/form")
    public String form(Model model) {
        User user = new User();
        user.setName("Diego");
        user.setLastName("Escobedo");
        user.setId("17.435.978-D");
        model.addAttribute("title", "User form");
        model.addAttribute("user", user);
        return "form";
    }
    @ModelAttribute("countryList")
    public List<Country> countryList(){
        return serviceCountry.list();
    }
    @ModelAttribute("countrys")
    public List<String> countrys(){
        return Arrays.asList("Mexico","United States of America", "Chile", "Argentina","Colombia","Italy","Portugal");
    }

    @ModelAttribute("countryMap")
    public Map<String, String> countrysMap(){
        Map<String, String> countrys = new HashMap<String, String>();
        countrys.put("MX", "Mexico");
        countrys.put("US", "United States of America");
        countrys.put("CL", "Chile");
        countrys.put("AR", "Argentina");
        countrys.put("CO", "Colombia");
        countrys.put("IT", "Italy");
        countrys.put("PT", "Portugal");
        return countrys;
    }

    @PostMapping("/form")
    public String process(@Valid User user,
                          BindingResult result,
                          Model model,
                          SessionStatus status) {
//        validation.validate(user, result);

        model.addAttribute("title", "Form submitted");

        if (result.hasErrors()) {
//            Map<String, String> errors = new HashMap<>();
//            result.getFieldErrors().forEach(err -> {
//                errors.put(err.getField(), "The space ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
//            });
//            model.addAttribute("error",errors);
            return "form";
        }
        model.addAttribute("user", user);
        status.setComplete();
        return "processed";
    }

}
