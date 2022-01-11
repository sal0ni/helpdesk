package beans;

import dao.CustomerDAO;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
public class ChangePasswordBean {
    private String oldpwd,newpwd,confirmpwd,message="";
    public ChangePasswordBean() {
    }
    public String getOldpwd() {
        return oldpwd;
    }
    public void setOldpwd(String oldpwd) {
        this.oldpwd = oldpwd;
    }

    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }

    public String getConfirmpwd() {
        return confirmpwd;
    }

    public void setConfirmpwd(String confirmpwd) {
        this.confirmpwd = confirmpwd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
     public void change(ActionEvent evt) {
       if (! newpwd.equals(confirmpwd))  {
            message="Error --> New password and confirm password do not match!";
            return;
       }
       HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);   
       String status = CustomerDAO.changePassword(
                session.getAttribute("customerid").toString(),
                oldpwd,newpwd);
       if ( status == null)
           message="Password Has Been Changed Successfully";
       else
           message = "Error -->" + status;
    }
    
}
