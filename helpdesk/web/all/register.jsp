<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:pt="http://java.sun.com/jsf/passthrough">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Registration</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="../home.css">
        <link rel="stylesheet" href="../login.css">

    </head>
    <body class="text-center">
        <center>
            <f:view>
                <div class="head bg-dark p-1">
                  <h2 class="text-white bolded mt-2">
                    Online Help Desk
                  </h2>
                </div>
                <div class="container">
                  <div class="row justify-content-center align-items-center" style="margin-top: 130px;">
                    <div class="col-lg-4 col-md-6 col-11">
                        <h:form styleClass="form-registration">
                            <h1 class="h3 mb-3 bolded">Registration</h1><br>
                            <label for="inputNumber" class="sr-only">Login Name</label><h6 style="text-align:left">Login Name</h6>
                            <h:inputText id="loginname" required="true" styleClass="form-control" size="20" value="#{CustomerBean.loginname}"  /> 
                            <h:message id="m1" for="loginname"  />             
                            <label for="inputPassword" class="sr-only">Password</label><br><h6 style="text-align:left">Password</h6>  
                            <h:inputSecret id="password" required="true" styleClass="form-control my-2" size="20" value="#{CustomerBean.password}"    /> 
                            <h:message id="m2" for="password"  />  
                            <label for="inputPassword" class="sr-only">Confirm Password</label><br><h6 style="text-align:left">Re-type Password</h6>
                            <h:inputSecret id="confirmpassword" required="true" styleClass="form-control my-2" size="20" value="#{CustomerBean.confirmpassword}" /> 
                            <h:message id="m3" for="confirmpassword" />
                            <label for="inputPassword" class="sr-only">Email</label><br><h6 style="text-align:left">Email</h6> 
                            <h:inputText id="email" required="true" styleClass="form-control my-2" size="20" value="#{CustomerBean.email}"  /> 
                            <h:message id="m4" for="email" />  
                            
                            <p/><br>
                            <h:commandButton value="Register" styleClass="btn btn-lg btn-dark btn-block" actionListener="#{CustomerBean.register}" />
                            <p/>
                            <h4> <h:outputText escape="false"  value="#{CustomerBean.message}"/> </h4>
                        </h:form>
                    </div>
                </div>
            </div>
            </f:view>
        </center>
    </body>
</html>
