<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Change Password</title>
    <link rel="stylesheet" href="home.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
 </head>
  <body>
  <div class="d-flex" id="wrapper">

    <div class="bg-dark text-white border-right" id="sidebar-wrapper">
      <div class="sidebar-heading bolded">Welcome ${sessionScope.loginname}</div>
      <div class="list-group list-group-flush">
        <a href="postissue.jsp" class="list-group-item list-group-item-action bg-dark text-white">Post Issue</a>
        <a href="search.jsp" class="list-group-item list-group-item-action bg-dark text-white">Search Issue</a>
        <a href="home.jsp" class="list-group-item list-group-item-action bg-dark text-white">My Issue</a>
        <a href="changepassword.jsp" class="list-group-item list-group-item-action bg-dark text-white">Change Password</a>
        <a href="logout.jsp" class="list-group-item list-group-item-action bg-dark text-white">Logout</a>
      </div>
    </div>
    

      <section class="container mt-5 mb-5">
        <header>
          <h1 class="text-dark bolded">Change Password</h1>
          <hr>
        </header>
        <f:view>
         <h:form>
        <div class="container">
          <div class="row"><br>
              
            <div class="col-lg-12 col-md-6 mt-4 d-flex justify-content-center justify-content-md-start">
              <div class="mx-2 my-auto d-inline w-100">
                  <h5>Current Password:</h5>
              <div class="input-group">
                  <h:inputSecret id="oldpassword" styleClass="form-control normal" required="true" size="20" value="#{CustomerBean.oldpassword}"/> 
                  <h:message id="m1" for="oldpassword" />                
              </div>
              </div>
          </div>
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
              <div class="mx-2 my-auto d-inline w-100">
                  <h5>New Password:</h5>
              <div class="input-group">
                  <h:inputSecret id="password" styleClass="form-control normal"  required="true" size="20" value="#{CustomerBean.password}"  /> 
                  <h:message id="m2" for="password" />  
                
              </div>
              </div>
          </div>
          
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
              <div class="mx-2 my-auto d-inline w-100">
                   <h5>Re-type Password:</h5>
              <div class="input-group">
                  <h:inputSecret id="confirmpassword" styleClass="form-control normal" required="true" size="20" value="#{CustomerBean.confirmpassword}"  /> 
                  <h:message id="m3" for="confirmpassword" />  
              </div>
              </div>
          </div><br>
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
                <h:commandButton value="Change Password" styleClass="mx-2 btn btn-lg btn-dark btn-block" actionListener="#{CustomerBean.changePassword}" />
             </div>
             
             <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
                <h:outputText  value="#{CustomerBean.message}"/>
            </div>
          </div>
        </div>
        </h:form>
        </f:view>
      </section>
    </div>

  </body>
</html>

















