package com.epam.anna_shafeeva.java.lesson7.task1.dao;

import com.epam.anna_shafeeva.java.lesson7.task1.Employee;

import java.util.List;

public interface EmployeeDAO {

    void insert(Employee employee);

    List<Employee> ListOfEmployees();
}
