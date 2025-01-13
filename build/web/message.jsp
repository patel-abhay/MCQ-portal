<%-- 
    Document   : message
    Created on : 27 Jun, 2023, 9:05:10 PM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            String right = (String)session.getAttribute("right");
            String wrong = (String)session.getAttribute("wrong");  
             String username = (String)session.getAttribute("username"); 
                 session.invalidate();
        %>
        <title>Message Page</title>
    </head>
    <body  style=" background-size: 100%;background-image:url(https://media.istockphoto.com/vectors/new-realistic-neon-sign-of-quiz-frame-logo-for-decoration-and-on-the-vector-id1339908748?k=20&m=1339908748&s=612x612&w=0&h=sHcDvBlwYJnT2JogtwM4C5XBmZR81Gmkk9Fr1e3y4Xw=)">       

        <div style="width:80%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;">
            <div style="background:#black;width:20%;">

                <a href="Singout.jsp" ><font color=FFFF00  size="5" face="Bold Italic" >Sign Out</a> </font></div> <br/><br/>
                <h1>  <font color=fffff size="7" face="Bold Italic" > <%=username%> Thank You for being the part of the  test and brushup your skills. <br/><font color="black"size="6" face="Bold Italic" > Your score:-</font><font color="yellow"size="6" face="Bold Italic" > <br>you are Good in = </font><font color="black"size="6" face="Bold Italic" ><%=right%>.</font><br>
                <font color="yellow"size="6" face="Bold Italic" >have to Improve for = </font><font color="red"size="6" face="Bold Italic" > <%=wrong%>.</font> </h1>
              <a href="Select.jsp"  ><font color=black  size="5" face="Bold Italic" >  <div style="width: 90px;height: 50px;font-size:20px"></div><font color=White  size="5" face="Bold Italic" >Test Again</font></a></Strong>

        </div>
    </body>
</html>
