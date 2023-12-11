package com.diegoesc.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

public class EditorCapsName extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        setValue(text.toUpperCase().trim());
    }
}
