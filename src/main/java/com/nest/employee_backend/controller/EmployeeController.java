package com.nest.employee_backend.controller;

import com.nest.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String Home() {
        return "welcome to employee homepage";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employee e) {
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMbno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "employee added successfully";
    }

    @PostMapping("/search")
    public String SearchEmployee() {
        return "welcome to searchemployee page";
    }

    @PostMapping("/edit")
    public String EditEmployee() {
        return "welcome to editemployee page";
    }

    @GetMapping("/viewall")
    public String ViewEmployee() {
        return "welcome to view all employee page";
    }

    @PostMapping("/delete")
    public String DeleteEmployee() {
        return "welcome to  delete employee page";

    }
}
