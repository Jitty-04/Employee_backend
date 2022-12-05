package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Home(){
        return "welcome to employee homepage";
    }
    @GetMapping("/add")
    public String AddEmployee(){
        return "welcome to addemployee page";
    }
}
