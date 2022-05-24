package com.sunglowsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            String record = "update candidate set first_name = 'Amit',last_name = 'Singh',email = 'a01122@gamil.com',mobile = '8989898989' where id = 4";
            PreparedStatement preparedStatement = connection.prepareStatement(record);
            System.out.println("record updated");
            preparedStatement.executeUpdate();
            connection.close();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
