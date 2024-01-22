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

/**
 *
 * @author anubh
 */
public class questionchecker extends HttpServlet {

    static int right = 0, wrong = 0, i = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("startingpage.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String ans = (String)session.getAttribute("ans");
        String answer = request.getParameter("answer");
        

        if (i<5) 
        {
            i++;
            if( answer!=null && answer.equals(ans) )
            {
                right++;
                response.sendRedirect("Choose.jsp");

            } 
            else
            {
                wrong++;
                response.sendRedirect("Choose.jsp");

            }
        } 
        else {
            i = 0;
          session.setAttribute("right", String.valueOf(right));
        session.setAttribute("wrong", String.valueOf(wrong)); 
            response.sendRedirect("message.jsp");
            right =0;
           wrong = 0;
            
        }
    }
}
