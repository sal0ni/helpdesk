<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="dao.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Issue Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="home.css">


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
        <h1 class="text-dark bolded">Issue Details</h1>
        <hr>
      </header>
      <div class="container">
        <div class="row">
            
          <div class="col-lg-12 col-md-6 my-4 d-flex justify-content-center justify-content-md-start">
            <div class="alert alert-dark w-100" role="alert">
              <div class="issue">
                        <%
                        String issueid = request.getParameter("issueid");
                        Issue issue = IssueDAO.getDetails(issueid);
                        
                        if (issue == null)
                        return;
                        
                        session.setAttribute("title",issue.getTitle());  // used by postreply.jsp
                        session.setAttribute("issueid",issue.getIssueid());  // used by postreply.jsp
                        
                       
                        %>
                        <b><%= issue.getTitle() %>  </b>
                        <p><%=issue.getDescription()%></p>
                        <b>Posted By :</b> <%= issue.getCustomer()%> <br/>
                        <b>Posted On :</b> <%= issue.getPostedon()%><br/>
                        <%
                        if ( issue.getStatus().equals("c") )  {
                               out.println("<br/>Closed On : " + issue.getResolvedon() + " By " +  issue.getSupportperson());
                        }
                        else
                            out.println("<p/><a href=postreply.jsp>Post Reply </a> <p/>");
                        
                        %>
                        
                    </div>
            </div>
          </div>
          
        </div>
        <%
                     if ( issue.getReplies().size() == 0 )
                          return;
                    %>
        <header>
          <h1 class="text-dark bolded">Replies</h1>
          <hr>
        </header>
        <div class="row">
          <div class="col-lg-12 col-md-6 my-4 d-flex justify-content-center justify-content-md-start">
            <div class="alert alert-dark w-100" role="alert">
              <%
                    for(Reply r : issue.getReplies()) {
                      out.println("<div class=reply>");
                      out.println( "<b>" + r.getTitle() + "</b>");
                      out.println("<p>" + r.getDescription() + "</p>");
                      out.println( "<b>Posted on " +  r.getPostedon() + " by " + r.getPostedby());
                      out.println("</b></div><hr>  <p/>");
                      
                    }
                    %>
            </div>
          </div>
        </div>
      </div>
    </section>




  </div>
  <!-- /#wrapper -->


  </body>
</html>












     
    