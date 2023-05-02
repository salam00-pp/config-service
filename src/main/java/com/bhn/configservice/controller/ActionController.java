package com.bhn.configservice.controller;

import com.bhn.configservice.model.Action;
import com.bhn.configservice.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/action")
public class ActionController {
    @Autowired
    ActionRepository actionRepository;
    @GetMapping("/actions")
    public List<Action> actionList()
    {
        return actionRepository.findAll();
    }
    @PostMapping()
    public Action saveAction(@RequestBody Action action)
    {
        return  actionRepository.save(action);
    }
}

