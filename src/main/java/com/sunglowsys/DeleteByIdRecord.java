package com.sunglowsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteByIdRecord {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            String record = "delete from candidate where id = 5";
            PreparedStatement preparedStatement = connection.prepareStatement(record);
            preparedStatement.executeUpdate();
            System.out.println("record deleted");
            connection.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
