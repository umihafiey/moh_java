<%-- 
    Document   : arimethic
    Created on : Mar 6, 2019, 2:54:30 PM
    Author     : MOH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        2 + 2 = ${2 + 2}
        
        <%-- The Scriplet --%>
        <hr>
        <h1>Scriplet</h1>
        <%
            String name = "Hafidzah Md Yusoff";
            out.println(name);
            out.println("<br>Your Ip Add : " + request.getRemoteAddr());
            out.println("<br>" + cetak(5));
        %>
        
        <%!
            public String cetak(int bil) {
                String str = "";
                for(int i=0; i<bil; i++) {
                    str += i + "--";
                }
                return str;
            }
        %>
        
        <hr>
        <h1>JSP Epression</h1>
        Tarikh hari ini : <%= new java.util.Date() %>
        
        <hr>
        <h1>JSP Directives</h1>
        <%@ include file="form.html" %>
    </body>
</html>
