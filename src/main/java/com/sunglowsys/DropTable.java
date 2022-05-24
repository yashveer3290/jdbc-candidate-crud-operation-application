package com.sunglowsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DropTable {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            String drop = "drop table candidate ";
            PreparedStatement preparedStatement = connection.prepareStatement(drop);
            System.out.println(" table dropped");
            preparedStatement.executeUpdate();
            connection.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
