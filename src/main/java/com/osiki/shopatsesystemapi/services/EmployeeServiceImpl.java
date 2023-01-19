package com.osiki.shopatsesystemapi.services;

import com.osiki.shopatsesystemapi.entity.EmployeeEntity;
import com.osiki.shopatsesystemapi.model.EmployeeModel;
import com.osiki.shopatsesystemapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {

        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employeeModel, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employeeModel;
    }

    @Override
    public List<EmployeeModel> getAllEmployes() {
        return null;
    }
}
