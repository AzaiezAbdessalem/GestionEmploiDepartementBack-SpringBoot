package com.GestionEmploi.Controller;

import com.GestionEmploi.Services.DepartmentService;
import com.GestionEmploi.Services.EmployeeService;
import com.GestionEmploi.entities.Employee;
import com.GestionEmploi.models.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value="*")
public class EmployeeRestController {
@Autowired
    EmployeeService employeeService;
@Autowired
    DepartmentService departmentService;
@PostMapping("/employees")
void  createEmployee(@RequestBody EmployeeModel e){
    Employee employee= new Employee();
    employee.setEmployeeLastName(e.getEmployeeLastName());
    employee.setEmployeeFirstName(e.getEmployeeFirstName());
    employee.setEmployeePhone(e.getEmployeePhoneNumber());
    employee.setDepartment(this.departmentService.findOneDepartment(e.getDepartmentId()));
    this.employeeService.createEmployee(employee);
}
@GetMapping("/employees")
    List<Employee> findAllEmployees(){
    return  this.employeeService.getEmployees();
}
@GetMapping("/employees/{id}")
    Employee getOneEmployee(@PathVariable long id){
    return  this.employeeService.getOneEmployee(id);
}
}
