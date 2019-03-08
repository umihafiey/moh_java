<%@page import="controllers.Project"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.ProjectModel"%>
<%@include file="../include/header.jsp" %>

<p>
  <a href="/pms/project/form.jsp" class="btn btn-info btn-sm">New Record</a>  
</p>
<form method="post" action="/pms/project">
    <div class="row">
        <div class="col-md-1">Tajuk</div>
        <div class="col-md-2"><input class="form-control" type="text" name="title"></div>
        <div class="col-md-1">Description</div>
        <div class="col-md-2"><input class="form-control" type="text" name="description"></div>
        <div class="col-md-1"><input class="btn btn-primary" type="submit" name="search" value="Search"></div>
    </div>
</form>

<p></p>

<table class="table table-bordered">
    
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
        <td>Tindakan</td>
    </tr>
    <%
        ArrayList list = (ArrayList) request.getAttribute("list");
        for (int i=0; i<list.size(); i++) {
            ProjectModel pro = (ProjectModel) list.get(i);            
    %>
    <tr>
        <td><%= i+1 %>.</td>
        <td><%= pro.getTitle() %></td>
        <td><%= pro.getDescription() %></td>
        <td>
            <a href="/pms/project?id=<%= pro.getId() %>&action=edit" class="btn btn-success btn-sm">Edit</a>
            <a href="/pms/project?id=<%= pro.getId() %>&action=del" class="btn btn-danger btn-sm">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
</table>

<%@ include file="../include/footer.jsp" %>