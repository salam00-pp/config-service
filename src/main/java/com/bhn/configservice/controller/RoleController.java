package com.bhn.configservice.controller;

import com.bhn.configservice.model.MenuItem;
import com.bhn.configservice.model.Role;
import com.bhn.configservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;
    @GetMapping("/all")
    public List<Role> getAllRoles()
    {
        return roleRepository.findAll();
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role)
    {
        return roleRepository.save(role);
    }

    @PutMapping
    public MenuItem updateRole(@RequestBody MenuItem menuItem)
    {
        return null;  //menuService.updateMenuItem(menuItem);
    }
}
