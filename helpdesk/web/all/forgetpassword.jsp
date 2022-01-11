<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
       <link href="home.css"  rel="stylesheet"/>
    </head>
    <body>
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
                <h:form styleClass="form-login">
                    <h1 class="h3 mb-3 bolded">Recover Password</h1>
                    Email Address : <h:inputText id="email" styleClass="form-control" required="true" size="20" value="#{CustomerBean.email}"  /> 
                     <h:message id="m4" for="email" />
                    <p/><br>
                    <h:commandButton value="Submit" styleClass="btn btn-lg btn-dark btn-block" actionListener="#{CustomerBean.recoverPassword}" />
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
