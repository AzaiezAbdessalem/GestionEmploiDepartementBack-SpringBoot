package com.GestionEmploi.Controller;

import com.GestionEmploi.Services.DepartmentService;
import com.GestionEmploi.entities.Department;
import com.GestionEmploi.models.DepartmentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class DepartmentRestController {
@Autowired
    DepartmentService departmentService;
@PostMapping("/departments")
void createDepartment(@RequestBody DepartmentModel model){
    Department department= new Department();
    department.setDepartmentName(model.getDepartmentName());
    this.departmentService.createDepartment(department);
}
@GetMapping("/departments")
    List<Department> Departments(){
    return this.departmentService.findDepartments();
}
@GetMapping("departments/{id}")
    Department getOneDepatment(@PathVariable long id){
    return this.departmentService.findOneDepartment(id);
}
}
