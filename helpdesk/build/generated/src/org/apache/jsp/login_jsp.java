package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputText_005fvalue_005fstyle_005frequired_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fmessage_005fid_005ffor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputSecret_005fvalue_005fstyle_005frequired_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputText_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandButton_005fvalue_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputText_005fvalue_005fstyle_005frequired_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fmessage_005fid_005ffor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputSecret_005fvalue_005fstyle_005frequired_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputText_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandButton_005fvalue_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005finputText_005fvalue_005fstyle_005frequired_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fmessage_005fid_005ffor_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005finputSecret_005fvalue_005fstyle_005frequired_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005foutputText_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandButton_005fvalue_005faction_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("        <link href=\"styles.css\"  rel=\"stylesheet\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("        ");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_005fview_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
    _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fview_005f0.setParent(null);
    _jspx_th_f_005fview_005f0.setJspId("jsp_712768178_0");
    int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
    if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_005fview_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <div class=\"head\">OnLine Help Desk</div>\r\n");
        out.write("        ");
        if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        \r\n");
        out.write("        <a href=\"./all/forgotpassword.jsp\">Forgot Password </a>\r\n");
        out.write("        <br/>\r\n");
        out.write("        <a href=\"./all/register.jsp\">Register New Product </a>\r\n");
        out.write("            \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fview_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ff_005fview.reuse(_jspx_th_f_005fview_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    _jspx_th_h_005fform_005f0.setJspId("jsp_712768178_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <h3>Login </h3>\r\n");
        out.write("            <table>\r\n");
        out.write("            <tr>\r\n");
        out.write("                <td align=\"right\">Login Name : </td>\r\n");
        out.write("                <td align=\"left\"> ");
        if (_jspx_meth_h_005finputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                ");
        if (_jspx_meth_h_005fmessage_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("            </td>\r\n");
        out.write("            </tr>\r\n");
        out.write("            \r\n");
        out.write("            <tr>\r\n");
        out.write("                <td align=\"right\">Password : </td>\r\n");
        out.write("                <td align=\"left\"> ");
        if (_jspx_meth_h_005finputSecret_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                ");
        if (_jspx_meth_h_005fmessage_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("            </tr>\r\n");
        out.write("            </table>\r\n");
        out.write("            <p/>\r\n");
        out.write("            ");
        if (_jspx_meth_h_005foutputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <p/>\r\n");
        out.write("            ");
        if (_jspx_meth_h_005fcommandButton_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fform_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fform.reuse(_jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f0 = new com.sun.faces.taglib.html_basic.InputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f0);
    _jspx_th_h_005finputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(24,34) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f0.setId("loginname");
    // /login.jsp(24,34) name = required type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_h_005finputText_005f0.setRequired(new org.apache.jasper.el.JspValueExpression("/login.jsp(24,34) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    // /login.jsp(24,34) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005finputText_005f0.setStyle(new org.apache.jasper.el.JspValueExpression("/login.jsp(24,34) 'width:150px'",_el_expressionfactory.createValueExpression("width:150px",java.lang.String.class)));
    // /login.jsp(24,34) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/login.jsp(24,34) '#{CustomerBean.loginname}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{CustomerBean.loginname}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f0.setJspId("jsp_712768178_2");
    int _jspx_eval_h_005finputText_005f0 = _jspx_th_h_005finputText_005f0.doStartTag();
    if (_jspx_th_h_005finputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005finputText_005fvalue_005fstyle_005frequired_005fid_005fnobody.reuse(_jspx_th_h_005finputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_005fmessage_005f0 = new com.sun.faces.taglib.html_basic.MessageTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fmessage_005f0);
    _jspx_th_h_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(25,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fmessage_005f0.setId("m1");
    // /login.jsp(25,16) name = for type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005fmessage_005f0.setFor(new org.apache.jasper.el.JspValueExpression("/login.jsp(25,16) 'loginname'",_el_expressionfactory.createValueExpression("loginname",java.lang.String.class)));
    _jspx_th_h_005fmessage_005f0.setJspId("jsp_712768178_3");
    int _jspx_eval_h_005fmessage_005f0 = _jspx_th_h_005fmessage_005f0.doStartTag();
    if (_jspx_th_h_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fmessage_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fmessage_005fid_005ffor_005fnobody.reuse(_jspx_th_h_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005finputSecret_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputSecret
    com.sun.faces.taglib.html_basic.InputSecretTag _jspx_th_h_005finputSecret_005f0 = new com.sun.faces.taglib.html_basic.InputSecretTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005finputSecret_005f0);
    _jspx_th_h_005finputSecret_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputSecret_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(31,34) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputSecret_005f0.setId("password");
    // /login.jsp(31,34) name = required type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = boolean methodSignature = null 
    _jspx_th_h_005finputSecret_005f0.setRequired(new org.apache.jasper.el.JspValueExpression("/login.jsp(31,34) 'true'",_el_expressionfactory.createValueExpression("true",boolean.class)));
    // /login.jsp(31,34) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005finputSecret_005f0.setStyle(new org.apache.jasper.el.JspValueExpression("/login.jsp(31,34) 'width:150px'",_el_expressionfactory.createValueExpression("width:150px",java.lang.String.class)));
    // /login.jsp(31,34) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputSecret_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/login.jsp(31,34) '#{CustomerBean.password}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{CustomerBean.password}",java.lang.Object.class)));
    _jspx_th_h_005finputSecret_005f0.setJspId("jsp_712768178_4");
    int _jspx_eval_h_005finputSecret_005f0 = _jspx_th_h_005finputSecret_005f0.doStartTag();
    if (_jspx_th_h_005finputSecret_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputSecret_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputSecret_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005finputSecret_005fvalue_005fstyle_005frequired_005fid_005fnobody.reuse(_jspx_th_h_005finputSecret_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_005fmessage_005f1 = new com.sun.faces.taglib.html_basic.MessageTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fmessage_005f1);
    _jspx_th_h_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(32,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fmessage_005f1.setId("m2");
    // /login.jsp(32,16) name = for type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005fmessage_005f1.setFor(new org.apache.jasper.el.JspValueExpression("/login.jsp(32,16) 'password'",_el_expressionfactory.createValueExpression("password",java.lang.String.class)));
    _jspx_th_h_005fmessage_005f1.setJspId("jsp_712768178_5");
    int _jspx_eval_h_005fmessage_005f1 = _jspx_th_h_005fmessage_005f1.doStartTag();
    if (_jspx_th_h_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fmessage_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fmessage_005fid_005ffor_005fnobody.reuse(_jspx_th_h_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f0 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
    _jspx_th_h_005foutputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(36,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/login.jsp(36,12) '#{CustomerBean.message}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{CustomerBean.message}",java.lang.Object.class)));
    _jspx_th_h_005foutputText_005f0.setJspId("jsp_712768178_6");
    int _jspx_eval_h_005foutputText_005f0 = _jspx_th_h_005foutputText_005f0.doStartTag();
    if (_jspx_th_h_005foutputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputText_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005foutputText_005fvalue_005fnobody.reuse(_jspx_th_h_005foutputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f0 = new com.sun.faces.taglib.html_basic.CommandButtonTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f0);
    _jspx_th_h_005fcommandButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fcommandButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /login.jsp(38,12) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fcommandButton_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/login.jsp(38,12) 'Login'",_el_expressionfactory.createValueExpression("Login",java.lang.Object.class)));
    // /login.jsp(38,12) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = java.lang.Object action() 
    _jspx_th_h_005fcommandButton_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/login.jsp(38,12) '#{CustomerBean.login}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{CustomerBean.login}",java.lang.Object.class,new Class[] {})));
    _jspx_th_h_005fcommandButton_005f0.setJspId("jsp_712768178_7");
    int _jspx_eval_h_005fcommandButton_005f0 = _jspx_th_h_005fcommandButton_005f0.doStartTag();
    if (_jspx_th_h_005fcommandButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fcommandButton_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh_005fcommandButton_005fvalue_005faction_005fnobody.reuse(_jspx_th_h_005fcommandButton_005f0);
    return false;
  }
}
