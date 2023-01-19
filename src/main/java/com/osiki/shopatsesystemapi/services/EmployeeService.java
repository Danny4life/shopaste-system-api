package com.osiki.shopatsesystemapi.services;

import com.osiki.shopatsesystemapi.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    EmployeeModel createEmployee(EmployeeModel employeeModel);

    List<EmployeeModel> getAllEmployes();
}
