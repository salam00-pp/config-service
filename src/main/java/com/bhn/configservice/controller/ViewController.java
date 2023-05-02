package com.bhn.configservice.controller;

import com.bhn.configservice.model.View;
import com.bhn.configservice.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/view")
public class ViewController {
    @Autowired
    ViewRepository viewRepository;
    @GetMapping("/views")
    public List<View> allViews()
    {
        return viewRepository.findAll();
    }

    @PostMapping
    public View saveView(@RequestBody View view)
    {
        return viewRepository.save(view);
    }



}
