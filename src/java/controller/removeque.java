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
import model.Queremove;

/**
 *
 * @author anubh
 */
public class removeque extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("DeletePage.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String edit = request.getParameter("edit");

        Queremove aq = new Queremove();
        boolean Login = aq.Addon(edit);
        if (Login) {
            HttpSession session = request.getSession(true);
            session.setAttribute("edit", edit);

            response.sendRedirect("Remove.html");
        } else {
            response.sendRedirect("QuestionAdd.html");
        }
    }

}
