package com.vnasibov;

import com.vnasibov.data.InitSQL;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     try {
         InitSQL.createTables();
     }catch (SQLException e){
         System.out.println(e.getMessage());
     }




    }
}
