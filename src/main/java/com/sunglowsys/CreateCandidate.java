package com.sunglowsys;

import java.sql.*;

public class CreateCandidate {
    public static void main(String[] args)throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "create table candidates" + "(id bigint not null," + "first_name varchar(20)," + "last_name varchar(20)," + "email varchar(30)," + "mobile varchar(12)," + " primary key(id))";
            System.out.println("query created");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate(query);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
