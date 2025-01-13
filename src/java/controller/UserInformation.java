/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Userdata;

/**
 *
 * @author anubh
 */
public class UserInformation extends HttpServlet        
    { 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
        
       resp.sendRedirect("startingpage.html");
        
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { 
        
        String username = request.getParameter("username"); 
        String password = request.getParameter("password"); 
      
            
         if (username != null && username != "")
        {
            Userdata u1 = new Userdata();
            boolean Login = u1.isRegister(username, password);
            if (Login)
            { 
             HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
                response.sendRedirect("Select.jsp");
            }  
             else
         {
            response.sendRedirect("startingpage.html");
         }
          
        } 
        else
        {
            response.sendRedirect("startingpage.html");
        }

    }
}

