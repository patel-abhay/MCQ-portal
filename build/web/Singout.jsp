<%-- 
    Document   : Singout
    Created on : 29 Jun, 2023, 4:45:42 PM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sing out Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("startingpage.html");

        %>
    </body>
</html>


