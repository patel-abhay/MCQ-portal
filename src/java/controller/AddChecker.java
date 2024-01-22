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
import model.AddQuestion;

/**
 *
 * @author anubh
 */
public class AddChecker extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("QuestionAdd.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        String question = request.getParameter("que");
        String op1 = request.getParameter("op1");
        String op2 = request.getParameter("op2");
        String op3 = request.getParameter("op3");
        String op4 = request.getParameter("op4");
        String ans = request.getParameter("ans");

        AddQuestion aq = new AddQuestion();
        boolean Login = aq.Addon(question, op1, op2, op3, op4, ans, number);
        if (Login) {
            HttpSession session = request.getSession(true);
            session.setAttribute("question", question);

            response.sendRedirect("Addques.html");
        } else {
            response.sendRedirect("QuestionAdd.html");
        }
    }

}
