package com.GestionEmploi.Services;

import com.GestionEmploi.entities.Department;

import java.util.List;

public interface DepartmentService {
void  createDepartment(Department d);
List<Department> findDepartments();
Department findOneDepartment(long id);
}
