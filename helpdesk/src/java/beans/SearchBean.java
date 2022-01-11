
package beans;

import dao.IssueDAO;
import javax.servlet.jsp.jstl.sql.Result;

public class SearchBean {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
     public Result getIssues() {
        try {
             return IssueDAO.search(pattern);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return(null);
        }
    }
    
       
}
