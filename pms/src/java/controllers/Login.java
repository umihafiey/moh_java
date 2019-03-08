package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.UserModel;

/**
 *
 * @author MOH
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffid = request.getParameter("staff_id");
        String pwd = request.getParameter("password");
        UserModel user = new UserModel();
        if (user.isExist(staffid, pwd)){
            //User wujud => set session then goto project list
            HttpSession sess = request.getSession();
            sess.setAttribute("loggedin", true);
            response.sendRedirect("/pms/project");            
            //request.getRequestDispatcher("project/list.jsp").forward(request, response);
        } else {
            //user tak wujud go back to login page
            response.sendRedirect("/pms/pub/login.jsp?no");
        }
    }

}
