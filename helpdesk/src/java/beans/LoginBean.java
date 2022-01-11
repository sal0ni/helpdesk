
package beans;

import dao.CustomerDAO;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;



public class LoginBean {
    private String loginname,password, message=""; 
    
    public LoginBean() {
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login(){
        String customerid = CustomerDAO.login(loginname,password);
        if ( customerid == null) {  // login failed 
            message="Sorry! Invalid Login!";
            return "failed";
        }
        else {
            // get current session 
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            session.setAttribute("customerid", customerid);
            session.setAttribute("loginname",loginname);
            return "success";
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
