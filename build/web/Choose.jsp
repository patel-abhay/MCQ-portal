<%-- 
    Document   : Choose
    Created on : 25 Jun, 2023, 1:13:36 PM
    Author     : anubh
--%>


<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Random"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="db.DBconnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 

<%!
    static HashSet<Integer> s1;
    static int a = 0;

    static {
        //int a;
        s1 = new HashSet<Integer>();
        Random r1 = new Random();
        s1 = r1.number();
    }
%>
<%
    Iterator<Integer> i = s1.iterator();
    if (i.hasNext()) {
        a = i.next();
        System.out.println(a);
        s1.remove(a);
    }
    String op1 = "", op2 = "", op3 = "", op4 = "", ans = "", que = "";
    ;
    Statement st = DBconnector.getStatement();
    try {
        String query = "SELECT * from mcq where number= " + (a % 10) + " ";
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            que = rs.getString("question");
            op1 = rs.getString("op1");
            op2 = rs.getString("op2");
            op3 = rs.getString("op3");
            op4 = rs.getString("op4");
            ans = rs.getString("ans");
            session.setAttribute("ans", ans);
            System.out.println(ans);
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
%>
<html>
    <head> 

        <title>Question Page </title>  
        <style>
            .btn{
                background: #fff;
                color: #222;
                font-weight: 500;
                width: 100%;
                border: 1px solid #222;
                padding: 10px;
                margin: 10px 0;
                text-align: left;
                border-radius: 4px;
                cursor: pointer; 
                transition: all 0.3s;
            } 
            .btn:hover{
                background: #000000;
                color:#fff;

            } 
            #next-btn{
                background: #001e4d;
                color: #fff;
                font-weight: 500;
                width: 150px;
                border:0;
                padding: 10px;
                margin: 20px auto 0;
                display: block;
                border-radius: 4px;
                cursor: pointer; 
                transition: all 0.3s;
            }
        </style>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head> 

    <form action="questionchecker" method="post">
        <body bgcolor="OE4D92"> 

            <div style="background:#fff;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 30px;">
                <h1> MCQ QUIZ</h1> 

                <div style="font-size: 18px;color:#001e4d;font-weight: 600">
                    <h1><%=que%></h1>
                    <div>
                        <input type="radio" name="answer"  value="<%=op1%>"  ><%=op1%></input><br/><br/>
                        <input type="radio" name="answer"  value="<%=op2%>"  ><%=op2%></input><br/><br/>
                        <input type="radio" name="answer"  value="<%=op3%>"   ><%=op3%></input><br/><br/>
                        <input type="radio" name="answer"  value="<%=op4%>"  ><%=op4%></input><br/><br/>
                    </div> 
                    <INPUT type="submit" value="Next" id="next-btn"></input></td> 
                </div>                    
            </div> 
            </form>                    
        </body>
</html>

