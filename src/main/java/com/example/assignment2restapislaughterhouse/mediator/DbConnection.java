package com.example.assignment2restapislaughterhouse.mediator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:SlaughterHouse.db");
    }
}