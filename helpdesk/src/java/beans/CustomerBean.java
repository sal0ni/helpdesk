package beans;

import dao.CustomerDAO;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.sql.Result;

import javax.mail.PasswordAuthentication;

import javax.mail.Authenticator;


public class CustomerBean {
    private String loginname,oldpassword,password,confirmpassword,email,serialno, message;
    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
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
    
    public String getConfirmpassword() {
        return confirmpassword;
    }
    
    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSerialno() {
        return serialno;
    }
    
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }
    
    public void register(ActionEvent evt){
        if (! password.equals(confirmpassword)) {
            message="Password and confirm password do not match!";
            return;
        }
        boolean done = CustomerDAO.register(loginname,password,email,serialno);
        if ( done)
            message= "Registration Completed. Use <a href=../login.jsp>Login Page</a> to login.";
        else
            message= "Sorry! Could not complete registration.";
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Result getIssues() {
        try {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            return CustomerDAO.getIssues( session.getAttribute("customerid").toString());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return(null);
        }
    }
    
    public void recoverPassword(ActionEvent evt) {
         // get password
        String password = CustomerDAO.getPassword(email);
        if ( password == null)
            message = "Sorry! Could not get password for the given email address";
        else {
            try {
            // send mail to user
            Properties props = System.getProperties();
            props.put("mail.smtp.auth","true");
	    props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");
            
            
             final String username = "mahatmasaloni@gmail.com";//
             final String psswrd = "9b44a915944f1a255a268db89979fec3";
            //Session session = Session.getDefaultInstance(props, null);
             Session session = Session.getInstance(props, 
                          new Authenticator(){
                    @Override
                             protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, psswrd);
                             }});
            // construct the message
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("mahatmasaloni@gmail.com"));
            msg.setRecipient(Message.RecipientType.TO,new InternetAddress("bardoliapriyank@gmail.com"));
            msg.setDataHandler( new DataHandler(new String("<html><body>Dear Customer,<p/>Use the following password to login. <p/>Password:" + password + "<p/>Webmaster,<br>onlinehelpdesk.com<body></html>"),
                    "text/html"));
            msg.setSubject("Password Recovery");
            // send message
            Transport.send(msg);
            message = "Password is sent to your email address. Use that password to login!";
                            
            }
            catch(Exception ex) {
                message = ex.getMessage();
                ex.printStackTrace();
            }
         }
    }
    public void changePassword(ActionEvent evt) {
        if (! password.equals(confirmpassword))  {
            message="Error --> New password and confirm password do not match!";
            return;
        }
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String status = CustomerDAO.changePassword(
                session.getAttribute("customerid").toString(),
getOldpassword(), password);
        if ( status == null)
            message="Password Has Been Changed Successfully";
        else
            message = "Error -->" + status;
    }
    
    
    public String login(){
        String customerid = CustomerDAO.login(loginname,password);
        if ( customerid == null) {  // login failed
            message="Sorry! Invalid Login!";
            return "failed";
        } else {
            // get current session
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            session.setAttribute("customerid", customerid);
            session.setAttribute("loginname",loginname);
            return "success";
        }
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }
}
