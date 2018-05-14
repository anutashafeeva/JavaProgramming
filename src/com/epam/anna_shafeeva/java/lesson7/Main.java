package com.epam.anna_shafeeva.java.lesson7;

import com.epam.anna_shafeeva.java.lesson7.task1.ConnectionFactory;
import com.epam.anna_shafeeva.java.lesson7.task1.Employee;
import com.epam.anna_shafeeva.java.lesson7.task1.daoImpl.EmployeeDAOImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main app = new Main();
        app.start();
    }

    private void start() {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.process();

        EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl(connectionFactory);
        List<Employee> listOfAllEmployees;
        listOfAllEmployees = employeeDAOImpl.ListOfEmployees();

        int maxIdOfEmployeeInTable = listOfAllEmployees.get(listOfAllEmployees.size() - 1).getId();

        for (int i = 0; i < listOfAllEmployees.size(); i++) {
            Employee employee = listOfAllEmployees.get(i);
            for (int j = 0; j < 10; j++) {
                employeeDAOImpl.insert(new Employee(maxIdOfEmployeeInTable + 1, employee.getName(), employee.getAge()));
                maxIdOfEmployeeInTable++;
            }
        }

        connectionFactory.close();
    }
}
