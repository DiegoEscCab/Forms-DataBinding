package com.diegoesc.springboot.form.app.editors;

import com.diegoesc.springboot.form.app.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
@Component
public class EditorRoles extends PropertyEditorSupport {
    @Autowired
    private RoleService service;
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(text);
            setValue(service.getById(id));
        } catch(NumberFormatException e) {
            setValue(null);
        }
    }
}
