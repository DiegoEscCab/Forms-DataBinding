package com.diegoesc.springboot.form.app.services;

import com.diegoesc.springboot.form.app.models.domain.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoleServiceImp implements RoleService{
    private List<Role> roles;
    public RoleServiceImp() {
        this.roles = new ArrayList<>();
        this.roles.add(new Role(1, "Administrator", "ROLE_ADMIN"));
        this.roles.add(new Role(2, "User", "ROLE_USER"));
        this.roles.add(new Role(3, "Moderator", "ROLE_MODERATOR"));
    }

    @Override
    public List<Role> toList() {
        return roles;
    }

    @Override
    public Role getById(Integer id) {
        Role result = null;
        for(Role role: roles){
            if (id == role.getId()){
                result = role;
                break;
            }
        }
        return result;
    }
}
