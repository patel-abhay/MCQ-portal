/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBconnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anubh
 */
public class Userdata { 
      public boolean isRegister(String username,String password) 
    {
         
        
  // String tablePassword=""; 
       try  
       { 
           int i=0;
                      Statement st = DBconnector.getStatement();
                     String query = "INSERT INTO user  VALUES ('"+username+"','"+password+"')";  
                      i = st.executeUpdate(query); 
          
           if(i>0) 
           {
               return true;
           }   
           else{
               
           } return false;
       
          }
       catch(SQLException e) 
       {
           System.out.println(e);
       }   
       
             return false;
    }
}
       
    

