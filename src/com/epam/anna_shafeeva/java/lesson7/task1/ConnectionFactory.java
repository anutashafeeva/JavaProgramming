package com.epam.anna_shafeeva.java.lesson7.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection = null;

    public void process() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Include PostgreSQL JDBC Driver in your library path!");
            e.printStackTrace();
            return;
        }

        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/Factory", "annashafeeva", "1234567");
        } catch (SQLException e) {
            System.out.println("ConnectionFactory Failed!");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("Success connection!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}