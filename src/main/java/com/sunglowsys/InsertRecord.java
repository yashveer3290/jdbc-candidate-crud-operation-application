package com.sunglowsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            String record = "insert into candidate (id, first_name, last_name, email, mobile) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(record);
            preparedStatement.setLong(1,5);
            preparedStatement.setString(2,"Hirdesh");
            preparedStatement.setString(3,"Kumar");
            preparedStatement.setString(4,"h01122@gamil.com");
            preparedStatement.setString(5,"344545889");

            System.out.println("record inserted");
            preparedStatement.executeUpdate();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
