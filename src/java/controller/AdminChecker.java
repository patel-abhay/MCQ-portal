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
import model.AdminCertifier;
import model.Userdata;

/**
 *
 * @author anubh
 */
public class AdminChecker extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Adminlogin.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

            if (username!= null && username!= "")       
           {
            AdminCertifier a1 = new AdminCertifier();
            boolean Login = a1.islogin(username, password);
            
            if (Login)
            {
               HttpSession session = request.getSession(true);
               session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            }
            else 
            {
                response.sendRedirect("Adminlogin.html");
            }

        } 
        else 
        {
            response.sendRedirect("Adminlogin.html");
        }
    }

}
