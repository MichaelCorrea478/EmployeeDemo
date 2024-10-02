package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employeeData);

    void deleteEmployee(Long id);
}
