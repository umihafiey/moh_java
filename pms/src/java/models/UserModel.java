package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel extends Model {
    private int id;
    private String staffid;
    private String pwd;
    private String role;
    private String name;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    //return true jika staffid dan pwd matched
    public boolean isExist(String staffid, String pwd){
        String sql = "SELECT * FROM users "
                   + "WHERE staff_id = '" + staffid + "' "
                   + "AND pwd = '" + pwd + "' ";
        
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                this.id = rs.getInt("id");
                this.pwd = rs.getString("pwd");
                this.staffid = rs.getString("staff_id");
                this.role = rs.getString("role");
                this.name = rs.getString("name");
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return false;   
    }
    
    public boolean insert() {
        String sql = "INSERT INTO users (name, pwd, role, gender)" + 
                     "VALUE('" + this.name + "','" + this.pwd + "','" + this.role + "','" + this.gender + "')";
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql); //insert, update, delete guna execute
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            
        }
        return true;     
    }
    
    public static void main(String[] args) {
        UserModel model = new UserModel();
        if (model.isExist("Hafidzah", "1234")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }     
          
    }
    
}
