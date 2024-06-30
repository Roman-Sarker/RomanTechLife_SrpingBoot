package com.techlife.romanTech.third.controller;

import com.techlife.romanTech.second.bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiParameterController {

    // Get parameter using Pathvariable  (http://localhost:8080/employee/5/roman/roman@gmail.com)
    @GetMapping("/employee/{id}/{name}/{email}")
    public Employee perticularEmployee(@PathVariable("id") int employeeId,
                                       @PathVariable String name,
                                       @PathVariable String email){
        Employee employee = new Employee(employeeId,name, email);
        System.out.println("employee Id : "+employee);
        return employee;
    }

    // Get parameter using RequestParameter
    // (http://localhost:8080/employee/query?id=10&name=sumon&email=sumon@gmail.com)
    @GetMapping("/employee/query")
    public Employee perticularEmployee1(@RequestParam int id,
                                        @RequestParam String name,
                                        @RequestParam String email){
        Employee employee = new Employee(id,name, email);
        return employee;
    }
}
