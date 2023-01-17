package com.osiki.shopatsesystemapi.controller;


import com.osiki.shopatsesystemapi.model.EmployeeModel;
import com.osiki.shopatsesystemapi.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.createEmployee(employeeModel);
    }
}
