/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-02-01 02:37:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class registerpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main/publicNavigations.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<title>I'MPOSSIBLE - Register Password</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- for filter bar -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\">\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
      out.write("<!-- Ionicons -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/jquery-ui.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://cdn.alloyui.com/3.0.1/aui/aui-min.js\"></script>\r\n");
      out.write("<link href=\"http://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".filter-col {\r\n");
      out.write("\tpadding-left: 10px;\r\n");
      out.write("\tpadding-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".testing {\r\n");
      out.write("\tmargin-bottom: 100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- for validation of the form email address -->\r\n");
      out.write("<script>\r\n");
      out.write("function ValidateEmail(mail) {\r\n");
      out.write("    var re = /^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/;\r\n");
      out.write("    return re.test(mail);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- end of validation for form -->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"form-horizontal\" method=\"post\" name=\"myForm\"\r\n");
      out.write("\t\taction=\"registerservlet\" onsubmit=\"return ValidateEmail(mail)\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"registrationpanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"panel-title\">Registration Page</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<fieldset style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Password for Parent</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i>Please note that your email address will be your\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusername.</i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Email Address:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"email address\" name=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"password\" name=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Re-enter\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tPassword:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Password for Child</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i>Please note that your email address will be your\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusername. </i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Email Address:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"email address\" name=\"email1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"password\" name=\"password1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-group-md\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-2\" for=\"category\">Re-enter\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tPassword:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"course_price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\twindow.params = function(){\r\n");
      out.write("\t   \t\t\t\t\t\t var params = {};\r\n");
      out.write("\t   \t\t\t\t\t\t var param_array = window.location.href.split('?')[1].split('&');\r\n");
      out.write("\t  \t\t\t\t\t\t  for(var i in param_array){\r\n");
      out.write("\t        \t\t\t\t\tx = param_array[i].split('=');\r\n");
      out.write("\t        \t\t\t\t\tparams[x[0]] = x[1];\r\n");
      out.write("\t   \t\t\t\t\t\t  }\r\n");
      out.write("\t   \t\t\t\t\t\t\treturn params;\r\n");
      out.write("\t\t\t\t\t\t\t}();\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.salutation +'\" name=\"salutation\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.sname +'\" name=\"sname\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.gname +'\" name=\"gname\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.gender +'\" name=\"gender\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.country +'\" name=\"country\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.contact_number +'\" name=\"contact_number\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.sa +'\" name=\"contact_number\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.address +'\" name=\"address\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.postal_code +'\" name=\"postal_code\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.salutation1 +'\" name=\"salutation1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.sname1 +'\" name=\"sname1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.gname1 +'\" name=\"gname1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.gender1 +'\" name=\"gender1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.dob +'\" name=\"dob\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.relationship +'\" name=\"relationship\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.country1 +'\" name=\"country1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.contact_number1 +'\" name=\"contact_number1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.address1 +'\" name=\"address1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write('<input type=\"hidden\" value=\"'+window.params.postal_code1 +'\" name=\"postal_code1\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\" style='text-align: right'>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-danger\" href=\"register.jsp\">Back</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t<footer id=\"footerMenu\"></footer>\r\n");
      out.write("\t<!-- end of footer -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/footer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
    // /registerpassword.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setVar("dataSource");
    // /registerpassword.jsp(10,0) name = driver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
    // /registerpassword.jsp(10,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost:3306/mydb");
    // /registerpassword.jsp(10,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setScope("session");
    // /registerpassword.jsp(10,0) name = user type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
    // /registerpassword.jsp(10,0) name = password type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setPassword("");
    int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
    if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
    return false;
  }
}