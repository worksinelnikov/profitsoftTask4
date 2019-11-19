package com.profitsoft.service;

import com.profitsoft.entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    Iterable<Employee> findAll();
    Iterable<Employee> saveAll(List<Employee> employees);
}
