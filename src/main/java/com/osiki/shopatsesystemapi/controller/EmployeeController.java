package com.osiki.shopatsesystemapi.controller;


import com.osiki.shopatsesystemapi.model.EmployeeModel;
import com.osiki.shopatsesystemapi.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/employees")
    public List<EmployeeModel> getAllEmployees(){
        return employeeService.getAllEmployes();
    }
}
