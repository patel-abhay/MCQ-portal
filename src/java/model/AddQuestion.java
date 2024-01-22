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
public class AddQuestion {

    public boolean Addon(String question, String op1, String op2, String op3, String op4, String ans,String number) 
    {
        try {
            int i = 0;
            Statement st = DBconnector.getStatement();
            String query = "INSERT  INTO mcq  VALUES ('" +number+ "','" + question + "','" + op1 + "','" + op2 + "','" + op3 + "','" + op4 + "','" + ans + "')";
            i = st.executeUpdate(query);

            if (i > 0)
            {
                return true;
            }

        } 
        catch (SQLException e)
        {
            System.out.println(e);
        }

        return false;
    }
}
