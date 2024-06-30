package com.techlife.romanTech.second.controller;

import com.techlife.romanTech.second.bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SecondController {

    // Single Employee  (http://localhost:8080/Employee)
    @GetMapping("/employee")
    public Employee employee(){
        Employee employee = new Employee(1,"Roman","roman@gmail.com");
        return employee;
    }

    // All Employee   (http://localhost:8080/Employees)
    @GetMapping("/employees")
    public List<Employee> employees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Roman","roman@gamil.com"));
        employees.add(new Employee(2,"sarker","sarker@gmail.com"));
        employees.add(new Employee(3,"Hasib", "hasib@gmail.com"));

        return employees;
    }
}
