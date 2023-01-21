package com.osiki.shopatsesystemapi.controller;


import com.osiki.shopatsesystemapi.model.EmployeeModel;
import com.osiki.shopatsesystemapi.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){

        boolean deleted = false;

        deleted = employeeService.deleteEmployee(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);

    }
}
