package filter;
import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter {
    private FilterConfig filterConfig = null;
    public AuthFilter() {
    }
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
      try {

            // check whether session variable is set 
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            HttpSession ses = req.getSession(false);
            System.out.println( req.getRequestURI());
            if ( req.getRequestURI().indexOf("/all/") >= 0  || 
                 req.getRequestURI().indexOf("/styles.css") >= 0  ||
                 req.getRequestURI().indexOf("/login.jsp") >=0 )  {
                 chain.doFilter(request, response);
            }
            else
              if (ses == null || ses.getAttribute("loginname") == null) {
                    res.sendRedirect(req.getContextPath() + "/faces/login.jsp");
              }
              else
                  chain.doFilter(request, response);
      }
     catch(Throwable t) {
         System.out.println( t.getMessage());
     }
    }
    
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }
    public void destroy() {
    }
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }
}
