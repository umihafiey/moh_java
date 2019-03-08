package Chapter22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Film {
        
    protected void list(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        //list all film title & desc
        // try..catch => exception/error handling
        //Try=code berada dlmnya, Catch= bila berlaku error
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=Asia/Singapore", "root", "mypwd@kkm123");
            // Create an SQL query
            String sql = "SELECT * from film";
            // Create an instance of the Statement object
            stmt = conn.createStatement();
            // Execute SQL and get obtain the ResultSet object
            rs = stmt.executeQuery(sql);
            
            // Process the result set - print Employees
            while (rs.next()){
                int id = rs.getInt("film_id");
                //String desc = rs.getString("description");
                //String job = rs.getString(“JOB_TITLE”);
                System.out.print(id + "\t");
                System.out.print(rs.getString("title") + "\t");
                System.out.println(rs.getString("description"));
            }        
        } catch (Exception e) {
            System.out.println(e.getMessage());        
        }
    }
    
    public static void main(String[] args) {
       //boleh guna Film = Film.list();
        Film f = new Film();
        f.list();
    }
}
