package com.GestionEmploi.Services;

import com.GestionEmploi.Repositories.EmployeeRepository;
import com.GestionEmploi.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(Employee e) {
    this.employeeRepository.save(e);
    }

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(long id) {
        return this.employeeRepository.findById(id).get();
    }
}
