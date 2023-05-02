package com.bhn.configservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WorkflowTestController {

    @GetMapping("/test-workflow")
    public String testWorkflow()
    {
        return "test";
    }
}
