<%-- 
    Document   : student_details
    Created on : Mar 6, 2019, 3:48:10 PM
    Author     : MOH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="model.StudentModel" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - View Student Details</title>
    </head>
    <body>
        <h1>Student Details</h1>
        <%
            StudentModel stud = (StudentModel) request.getAttribute("stud");
            //out.print("Id : " + stud.id);
            //out.print("<br>");
            //out.print("Name : " + stud.name);
        %>
        ID : <%= stud.id %>
        <br>
        Name : <%= stud.name %>
    </body>
</html>
