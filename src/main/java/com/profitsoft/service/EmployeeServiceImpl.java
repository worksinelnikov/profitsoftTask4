package com.profitsoft.service;

import com.profitsoft.entity.Employee;
import com.profitsoft.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jpaEmployeeService")
@Repository
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Iterable<Employee> saveAll(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }
}
