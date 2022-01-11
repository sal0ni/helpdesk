package beans;

import dao.CustomerDAO;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PostReplyBean {
    private String issueid, title, description, message, customer;
    public PostReplyBean() {
        HttpSession session  = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        title = "Re: " + (String) session.getAttribute("title");
        customer = (String) session.getAttribute("loginname");
        issueid = (String) session.getAttribute("issueid");
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
    
    public void postReply(ActionEvent evt) {
       String status = CustomerDAO.postReply(issueid,customer,title, description);
       if ( status == null)
           setMessage("Reply Has Been Posted Successfully");
       else
           setMessage("Error -->" + status);
    }

}
