import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StudentModel;

@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException 
    {
        //Set response content type
        response.setContentType("text/html");
        //Actual logic goes here
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("id");
        int studId = Integer.parseInt(request.getParameter("id"));
        StudentModel stud = new StudentModel().getOne(studId);
        request.setAttribute("stud", stud);
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        dispatch.forward(request, response);
    }
}
