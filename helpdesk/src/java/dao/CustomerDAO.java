package dao;
import dao.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

public class CustomerDAO {
   
    public static String getPassword(String email) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("select password from customers where email = ?");
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            String password = null;
            if ( rs.next() )
                password = rs.getString("password");
            rs.close();
            con.close();
            return password;
        } catch(Exception ex) {
            return null;
        }
    }
    
   
       public static Result getIssues(String customerid) throws Exception {
            Connection con =  Database.getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from issues where customerid = " + customerid + " order by issueid desc");
            System.out.println("got data");
            return( ResultSupport.toResult(resultSet));
       }
            
        public static String login(String lname, String pwd) {
        try {
            Connection con = Database.getConnection();
            if ( con == null )
                return null;
            PreparedStatement ps = con.prepareStatement("select customerid from customers where loginname = ? and password = ?");
            ps.setString(1,lname);
            ps.setString(2,pwd);
            ResultSet rs = ps.executeQuery();
            String customerid=null;
            if ( rs.next() )  // found - return fullname
                customerid = rs.getString(1);
            rs.close();
            con.close();
            return customerid;
        } catch(Exception ex) {
            return null;
        }
    }
        
     public static String changePassword( String customerid, String oldpwd, String newpwd) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("update customers set password = ? where customerid = ? and password = ?");
            ps.setString(1, newpwd);
            ps.setString(2, customerid);
            ps.setString(3, oldpwd);
            int count  = ps.executeUpdate();
            ps.close();
            con.close();
            if ( count == 1)
                return null;
            else
                return "Invalid Old Password!";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }
     
     
     
 
    public static String postIssue(String customerid, String title,String description) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into issues values(issueid.nextval,?,?,?,sysdate,'o',null,null)");
            ps.setString(1,customerid);
            ps.setString(2,title);
            ps.setString(3,description);
            ps.executeUpdate();
            return null;
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }
    
    public static String postReply(String issueid,String customer,String title,String description) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into issueresponses values( irid.nextval,?,?,?,sysdate,?)");
            ps.setString(1,issueid);
            ps.setString(2,title);
            ps.setString(3,description);
            ps.setString(4,customer);
            ps.executeUpdate();
            return null;
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }
    

    public static boolean register(String loginname,String password, String email,String serialno) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into customers values( customerid.nextval,?,?,sysdate,?,?)");
            ps.setString(1,loginname);
            ps.setString(2,password);
            ps.setString(3,email);
            ps.setString(4,serialno);
            ps.executeUpdate();
            return true;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
