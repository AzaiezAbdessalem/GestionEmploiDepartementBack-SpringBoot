package com.GestionEmploi.Repositories;

import com.GestionEmploi.entities.Department;
import com.GestionEmploi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
