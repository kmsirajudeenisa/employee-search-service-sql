package com.example.employeesearch.service;

import com.example.employeesearch.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee employee);

    Employee findById(Long id);

    List<Employee> findAll();

    Employee update(Long id, Employee employee);

    void delete(Long id);

    List<Employee> searchByName(String name);

    List<Employee> findByDepartment(String department);

    List<Employee> findByDesignation(String designation);
}