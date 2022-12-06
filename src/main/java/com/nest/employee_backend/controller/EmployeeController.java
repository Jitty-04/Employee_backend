package com.nest.employee_backend.controller;

import com.nest.employee_backend.dao.EmployeeDao;
import com.nest.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Home() {
        return "welcome to employee homepage";
    }
    @CrossOrigin(origins = "*")

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
        dao.save(e);

        return "employee added successfully";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String SearchEmployee() {
        return "welcome to searchemployee page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String EditEmployee() {
        return "welcome to editemployee page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employee> ViewEmployee() {
        return (List<Employee>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String DeleteEmployee() {
        return "welcome to  delete employee page";

    }
}
