package com.profitsoft.service;

import com.profitsoft.entity.EmployeeType;

import java.util.List;

public interface EmployeeTypeService {

    Iterable<EmployeeType> findAll();
    Iterable<EmployeeType> saveAll(List<EmployeeType> employees);

}
