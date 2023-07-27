package com.GestionEmploi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        EmployeeLastName = employeeLastName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private String employeeFirstName;
    private String EmployeeLastName;
    private String employeePhone;
    @OneToOne
    Department department;



}
