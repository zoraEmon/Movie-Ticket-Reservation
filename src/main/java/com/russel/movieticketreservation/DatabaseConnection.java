package com.russel.movieticketreservation;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    public static DriverManager driverManager;

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketreservation", "root" , "1Ka!2ll$kj_9Z");

            System.out.println("Connected to database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ArrayList> retrieveData() throws SQLException {
        ArrayList<ArrayList> data = new ArrayList<>();

        ArrayList<String> user = new ArrayList<>();

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");


        while(resultSet.next()) {
            String name = resultSet.getString("name");
            String password = resultSet.getString("password");

            user.add(name);
            user.add(password);

            data.add(user);
        }


        return data;
    }
}
