/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anubh
 */
public class Database {
    static Connection con=null;
    static Statement st=null;  
    public static Statement getStatement;
     
    static
    {
    try  
         {
             Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root"); 
             System.out.println("connected");
             st=con.createStatement(); 
             
            
            
         }
           catch(ClassNotFoundException e) 
                          
             {
                  System.out.println(e);
              } 
              catch(SQLException e) 
                 {
                    System.out.println(e);
                 }
           } 
    public static Statement getStatement() 
    {
        return st ;
    }
      public static Connection getConnection() 
    {
        return con ;
    }
}

    

