package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel extends Model {
    //return true jika staffid dan pwd matched
    public boolean isExist(String staffid, String pwd){
        String sql = "SELECT * FROM users "
                   + "WHERE staf_id = '" + staffid + "' "
                   + "AND pwd = '" + pwd + "' ";
        
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return false;   
    }
    
    public static void main(String[] args) {
        UserModel model = new UserModel();
        if (model.isExist("Ros", "12343")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }     
          
    }
    
}
