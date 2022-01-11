<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="home.css">
        <link rel="stylesheet" href="login.css">
    </head>
    <body  class="text-center">
       
        <f:view>
           <div class="head bg-dark p-1">
              <h2 class="text-white bolded mt-2">
                Online Help Desk
              </h2>
            </div>
        <div class="container">
            <div class="row justify-content-center align-items-center" style="margin-top: 130px;">
                <div class="col-lg-4 col-md-6 col-11">
                    <h:form styleClass="form-login">
                       <h1 class="h3 mb-3 bolded">Login</h1>
                       <label for="inputNumber" class="sr-only">Login Name</label><br>
                        <h6 style="text-align:left">Login Name</h6>
                        <h:inputText id="loginname" label="Name" required="true" styleClass="form-control" value="#{CustomerBean.loginname}"  />                       
                        <h:message id="m1" for="loginname"  />                          
                        <label for="inputPassword" class="sr-only">Password</label>
                        <br><h6 style="text-align:left">Password</h6>
                        <h:inputSecret id="password" label="Password" required="true" styleClass="form-control my-2" value="#{CustomerBean.password}" />                        
                        <h:message id="m2" for="password" />                        
                        <h:outputText  value="#{CustomerBean.message}"/>
                        <p/>
                        
                    
                    <div class="mb-3">
                      <label>
                        Don't have an account? <a href="./all/register.jsp">Register</a>
                      </label>
                    </div>
                    <h:commandButton value="Login" styleClass="btn btn-lg btn-dark btn-block" action="#{CustomerBean.login}" />
                    <p/>
                    <div class="mb-3">
                      <label>
                        <a href="./all/forgetpassword.jsp">Forgotten Password?</a>
                      </label>
                    </div>                    

                    </h:form>
                </div>
            </div>
        </div>
        
        </f:view>
       
    </body>
</html>
