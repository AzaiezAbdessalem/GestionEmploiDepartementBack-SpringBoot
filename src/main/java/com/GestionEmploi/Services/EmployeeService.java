package com.GestionEmploi.Services;

import com.GestionEmploi.entities.Employee;

import java.util.List;

public interface EmployeeService {
void  createEmployee(Employee e);
List<Employee> getEmployees();
Employee getOneEmployee(long id);
}
