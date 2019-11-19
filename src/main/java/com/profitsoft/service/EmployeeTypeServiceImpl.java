package com.profitsoft.service;

import com.profitsoft.entity.EmployeeType;
import com.profitsoft.repos.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jpaEmployeeTypeService")
@Repository
@Transactional
public class EmployeeTypeServiceImpl implements EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    @Override
    public Iterable<EmployeeType> findAll() {
        return null;
    }

    @Override
    public Iterable<EmployeeType> saveAll(List<EmployeeType> employees) {
        return null;
    }
}
