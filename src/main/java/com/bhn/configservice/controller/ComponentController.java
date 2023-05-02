package com.bhn.configservice.controller;

import com.bhn.configservice.model.Component;
import com.bhn.configservice.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/component")
public class ComponentController {
    @Autowired
    ComponentRepository componentRepository;

    @GetMapping("/components")
    public List<Component> allComponent()
    {
        return componentRepository.findAll();
    }
    @PostMapping
    public Component saveComponent(@RequestBody Component comp)
    {
        return componentRepository.save(comp);
    }
}
