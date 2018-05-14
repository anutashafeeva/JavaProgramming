package com.epam.anna_shafeeva.java.lesson7.task1.daoImpl;

import com.epam.anna_shafeeva.java.lesson7.task1.ConnectionFactory;
import com.epam.anna_shafeeva.java.lesson7.task1.Employee;
import com.epam.anna_shafeeva.java.lesson7.task1.dao.EmployeeDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private ConnectionFactory connectionFactory;

    public EmployeeDAOImpl(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public void insert(Employee employee) {
        String query = "INSERT INTO employees (id, name, age)" +
                " VALUES (?, ?, ?)";
        Connection connection = this.connectionFactory.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Employee> ListOfEmployees() {

        List<Employee> listOfEmployees = new ArrayList<>();
        String query = "SELECT * FROM employees";
        Connection connection = this.connectionFactory.getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                listOfEmployees.add(new Employee(id, name, age));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listOfEmployees;
    }
}
