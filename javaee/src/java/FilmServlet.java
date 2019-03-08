import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(urlPatterns = {"/film"})
public class FilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        PrintWriter out = response.getWriter();
        //connect to MySQL database
        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=Asia/Singapore", "root", "mypwd@kkm123");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mypwd@kkm123");
            // Create an instance of the Statement object
            stmt = conn.createStatement();
            // Create an SQL query
            String sql = "SELECT * from film";
                        // Execute SQL and get obtain the ResultSet object
            rs = stmt.executeQuery(sql);
            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<td>ID</td>");
            out.print("<td>Title</td>");
            out.print("<td>Description</td>");
            out.print("</tr>");
            // Process the result set - print Employees
            while (rs.next()){
                int id = rs.getInt("film_id");
                out.print("<tr>");
                out.print("<td>" + id + "</td>");
                out.print("<td>" + rs.getString("title") + "</td>");
                out.print("<td>" + rs.getString("description") + "</td>");
                out.print("</tr>");
            }   
            out.print("</table>");
        } catch (Exception e) {
            System.out.println(e.getMessage());        
        }
        
        //query
        
        
        //display result
        
        
    }


}
