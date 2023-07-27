package com.GestionEmploi.Services;

import com.GestionEmploi.Repositories.DepartmentRepository;
import com.GestionEmploi.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements  DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public void createDepartment(Department d) {
        this.departmentRepository.save(d);

    }

    @Override
    public List<Department> findDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findOneDepartment(long id) {
        return this.departmentRepository.findById(id).get();
    }
}
