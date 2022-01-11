package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

public class IssueDAO {
     public static Issue getDetails(String issueid) {
        Connection con=null;
        PreparedStatement ps =null;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement("select i.*, loginname from issues i, customers c where issueid = ? and c.customerid = i.customerid");
            ps.setString(1,issueid);
            ResultSet rs = ps.executeQuery();
            if (! rs.next() ) return null;
            Issue issue = new Issue();
            issue.setIssueid(issueid);
            issue.setCustomerid( rs.getString("customerid"));
            issue.setCustomer( rs.getString("loginname"));
            issue.setTitle( rs.getString("issuetitle"));
            issue.setDescription( rs.getString("issuedescription"));
            issue.setPostedon( rs.getString("postedon"));
            issue.setStatus( rs.getString("status"));
            issue.setResolvedon( rs.getString("resolvedon"));
            issue.setSupportperson( rs.getString("supportperson"));
            rs.close();
            // get replies
            ps = con.prepareStatement("select * from issueresponses where issueid = ?");
            ps.setString(1,issueid);
            ArrayList<Reply> replies = new ArrayList<Reply>();
            rs = ps.executeQuery();
            while ( rs.next()){
                Reply r = new Reply();
                r.setTitle( rs.getString("irtitle"));
                r.setDescription( rs.getString("irdescription"));
                r.setPostedon( rs.getString("postedon"));
                r.setPostedby( rs.getString("postedby"));
                replies.add(r);
            }
            rs.close();
            issue.setReplies(replies);
            con.close();
            return issue;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        finally {
             try {
                ps.close();
                con.close();
             }
             catch(Exception ex) {}
        }
     }
     
     public static Result search(String pattern) {
        Connection con=null;
        PreparedStatement ps =null;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement("select * from issues where upper(issuetitle) like ?  order by issueid desc");
            ps.setString(1,"%" + pattern.toUpperCase() + "%");
            ResultSet rs = ps.executeQuery();
            return ResultSupport.toResult(rs);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        finally {
             try {
                ps.close();
                con.close();
             }
             catch(Exception ex) {}
        }
     } // search
}
