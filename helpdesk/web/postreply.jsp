<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post Reply</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">      
    
        <link href="home.css" rel="stylesheet"/>
    </head>
    <body>
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
          <h1 class="text-dark bolded">Post Reply</h1>
          <hr>
        </header>
        <div class="container">
          <div class="row">
              <f:view>
                <h:form styleClass="mx-2 my-auto d-inline w-100">
          
            <div class="col-lg-12 col-md-6 mt-4 d-flex justify-content-center justify-content-md-start">
                <div class="mx-2 my-auto d-inline w-100">
                      <h5>Title:</h5>
                      <div class="input-group">
                          <h:inputText id="title" required="true" styleClass="form-control normal"  size="50" value="#{PostReplyBean.title}"  /> 
                          <h:message id="m1" for="title" />  
                      </div>
                  </div>
            </div>
            <br>
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
                <div class="mx-2 my-auto d-inline w-100">
                    <h5>Description:</h5>
                    <div class="input-group">
                        <h:inputTextarea  id="description" styleClass="form-control normal" rows="5" cols="50" value="#{PostReplyBean.description}"  /> 
                        <h:message id="m2" for="description" />   
                    </div>
                </div>
            </div>
            <br>
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
               
              
                        <h:commandButton value="Post Reply" styleClass="mx-2 btn btn-lg btn-dark btn-block" actionListener="#{PostReplyBean.postReply}" />
                        
            </div>
            <div class="col-lg-12 col-md-6 mt-3 d-flex justify-content-center justify-content-md-start">
               
                        <h:outputText  value="#{PostReplyBean.message}"/>
            </div>
             
              </h:form>
                </f:view>
          </div>
          
        </div>
      </section>
    </div>

  </body>
</html>
