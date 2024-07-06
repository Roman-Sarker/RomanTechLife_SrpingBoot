package com.techlife.romanTech.third.controller;

import com.techlife.romanTech.second.bean.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiParameterController {

    //1. Get parameter using Pathvariable  (http://localhost:8080/employee/5/roman/roman@gmail.com)
    @GetMapping("/employee/{id}/{name}/{email}")
    public Employee perticularEmployee(@PathVariable("id") int employeeId,
                                       @PathVariable String name,
                                       @PathVariable String email){
        Employee employee = new Employee(employeeId,name, email);
        System.out.println("employee Id : "+employee);
        return employee;
    }

    //2.0. Get parameter using RequestParameter
    // (http://localhost:8080/employee/query?id=10&name=sumon&email=sumon@gmail.com)
    @GetMapping("/employee/query")
    public Employee perticularEmployee1(@RequestParam int id,
                                        @RequestParam String name,
                                        @RequestParam String email){
        Employee employee = new Employee(id,name, email);
        return employee;
    }

    //2.1. Get parameter using RequestParameter
    // (http://localhost:8080/employee/query2?id=10&name=sumon&email=sumon@gmail.com)
    @GetMapping("/employee/query2")
    public Employee perticularEmployee2(HttpServletRequest request){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Employee employee = new Employee(Integer.parseInt(id),name, email);
        return employee;
    }

    //3. Get JSON Parameter in body (http://localhost:8080/employee/sendJsonInBody)
    @GetMapping("/employee/sendJsonInBody")
    public Employee getJsonInBody(@RequestBody Employee employee){
        System.out.println("Param : "+employee.toString());
        return employee;
    }
}
