<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css"
              href="/pms/assets/bootstrap/css/bootstrap.css"
        <title>PMS Login</title>
    </head>
    <body>
        <%
            String no = request.getParameter("no");
            if (no != null) {
                out.print("<div class='alert alert-danger col-md-6'>Wrong Staff Id and Password</div>");
            }
        %>
        <div class="col-md-6" style="background-color : #eee;">
            <form method="post" action="/pms/login" >            
                <div>Staff Id</div>
                <div><input class="form-control" type="text" name="staff_id"></div>
                <div>Password</div>
                <div><input class="form-control" type="text" name="pwd"></div>
                <div><input class="btn btn-primary" type="submit" value="Login"></div>   
            </form>
        </div>
    </body>
</html>
