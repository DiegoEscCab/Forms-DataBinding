package com.diegoesc.springboot.form.app.editors;

import com.diegoesc.springboot.form.app.services.ServiceCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.beans.PropertyEditorSupport;
@Component
public class EditorPropertyCountry extends PropertyEditorSupport {
    @Autowired
    private ServiceCountry Country;
    @Override
    public void setAsText(String idString) throws IllegalArgumentException {
        try {
            Integer id = Integer.parseInt(idString) ;
            this.setValue(Country.getById(id));
        } catch (NumberFormatException e){
         setValue(null);
        }
    }
}

