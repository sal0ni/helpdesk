<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Search Issue</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">      
    <link rel="stylesheet" href="home.css">

  </head>
  <body>
      <%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
      <%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
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
        <h1 class="text-dark bolded">Search</h1>
        <hr>
      </header>
      <f:view>
   <h:form>
        <div class="container">
          <div class="row">
          
            <div class="col-lg-12 col-md-6 mt-4 d-flex justify-content-center justify-content-md-start">
            <div class="mx-2 my-auto d-inline w-100">
              <div class="input-group">
                  <h:inputText id="pattern" styleClass="form-control normal" value="#{SearchBean.pattern}"/>
                  <span class="input-group-append">
                  <h:commandButton styleClass="form-control normal"  value="Search"/>
                  </span>
              </div>
            </div>
            </div>
            
          </div>
       

          <div class="col-lg-12 col-md-6 mt-5 d-flex justify-content-center justify-content-md-start">
            
        <h:dataTable styleClass="table table-striped" rendered="#{SearchBean.issues.rowCount > 0}" value="#{SearchBean.issues}" var="issue" width="100%" border="1">
        <h:column>
            <f:facet name="header"> <f:verbatim>Title</f:verbatim> </f:facet>
            <h:outputText value="#{issue.issuetitle}"/>
        </h:column>
        <h:column>
            <f:facet name="header"> <f:verbatim>PostedOn</f:verbatim> </f:facet>
            <h:outputText value="#{issue.postedon}"/>
        </h:column>
        <h:column>
            <f:facet name="header"><f:verbatim>Status</f:verbatim> </f:facet>
            <h:outputText  value="#{issue.status == 'o' ? 'Open' : 'Closed'}"/>
        </h:column>
        
        <h:column>
            <f:facet name="header"><f:verbatim>&nbsp;</f:verbatim></f:facet>
            <h:outputLink value="showissue.jsp">
                <h:outputText value="Details"/>
                <f:param name="issueid" value="#{issue.issueid}"/>
            </h:outputLink>
        </h:column>
        
    </h:dataTable>
            
          </div>
        </div>
  </h:form>
</f:view>    
    </section>

    </div>

  </body>
</html>











