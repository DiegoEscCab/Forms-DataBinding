package com.diegoesc.springboot.form.app.services;

import com.diegoesc.springboot.form.app.models.domain.Role;
import java.util.List;

public interface RoleService {

    public List<Role> toList();
    public Role getById(Integer id);
}
