/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anubh
 */
public class AdminCertifier {

    public boolean islogin(String username, String password) 
    {

        String tablePassword="",user=""; 
       try  
       {
           Statement st = DBconnector.getStatement();
           String query = "SELECT * from admin  "; 
           ResultSet rs = st.executeQuery(query);                                   
          
           if(rs.next()) 
           { 
               user = rs.getString("username"); 
               tablePassword = rs.getString("password"); 
                
           }  
           else 
           {
               return false;
           }
       } 
       catch(SQLException e) 
       {
           System.out.println(e);
       }
       
     
    if(password.equals(tablePassword)&& username.equals(user) )
       { 
           return true;
       } 
         return false;
    }     
}