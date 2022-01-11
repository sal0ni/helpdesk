package beans;

import dao.CustomerDAO;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

public class PostIssueBean {
    private String title;
    private String description;
    private String message = "";
    public PostIssueBean() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void postIssue(ActionEvent evt) {
       // post issue here        
       HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);   
       String status = CustomerDAO.postIssue( session.getAttribute("customerid").toString(),
                  title, description);
       if ( status == null)
           message="Issue Has Been Posted Successfully";
       else
           message = "Error -->" + status;
    }
}
