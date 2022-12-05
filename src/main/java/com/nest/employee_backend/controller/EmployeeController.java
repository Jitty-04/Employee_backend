package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String Home(){
        return "welcome to employee homepage";
    }
    @PostMapping("/add")
    public String AddEmployee(){
        return "welcome to addemployee page";
    }
    @PostMapping("/search")
    public String SearchEmployee(){
        return "welcome to searchemployee page";
    }
    @PostMapping("/edit")
    public String EditEmployee(){
        return "welcome to editemployee page";
    }
    @GetMapping("/viewall")
    public String ViewEmployee(){
        return "welcome to view all employee page";
    }
    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "welcome to  delete employee page";
    }
}
