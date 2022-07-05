package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlCon {
    public static final String NAME_USER="Egor";
    public static final String PASSWORD="qazplmwsxokn134";
    public static final String URL="http://194.87.210.23/";
    public static Connection connection;
    public static Statement statement;

    static {
        try{
            connection= DriverManager.getConnection(URL,NAME_USER,PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    static {
        try {
            statement=connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
