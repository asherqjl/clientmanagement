/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-01-13 03:53:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WebContent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class displayStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WebContent/doConnection.jsp", Long.valueOf(1452512059528L));
  }

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
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
 

String root = "root";
String mydb = "jdbc:mysql://localhost:3306/mydb";
String pwd = "";
String jdbc = "com.mysql.jdbc.Driver";


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<title>I'MPOSSIBLE - Manage Status</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/home.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- start of navigation bar  -->\r\n");
      out.write("\t<nav id=\"navMenu\"></nav>\r\n");
      out.write("\t<!-- End of navigation bar  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"jumbotron text-center\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<h1>Manage Status</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"adminIndex.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"manageStatus.html\">Manage\r\n");
      out.write("\t\t\t\t\t\t\t\tStatus</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--  Icons for delete, edit and copy -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"icons\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"addStatus.html\"><button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-plus\"></span> Add\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-sm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"confirm('Delete/Uninstall cannot be undone! Are you sure you want to do this?') ? $('#form-product').submit() : false;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-trash\"></span> Delete\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"editStatus.html\"><button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-edit\"></span> Edit\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-copy\"></span> Copy\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td style=\"width: 1px;\" class=\"text-center\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-sorter=\"false\"><input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"$('input[name*=\\'selected\\']').prop('checked', this.checked);\" /></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\"><a href=\"#\" class=\"asc\">Status\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tName</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\"><a href=\"#\" class=\"asc\">Status\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tDescription</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														Connection con = null;

														Class.forName(jdbc);

														con = DriverManager.getConnection(mydb, root, pwd);

														String query = "SELECT * FROM  `status` ";

														Statement statement = con.createStatement();

														ResultSet resultset = statement.executeQuery(query);

														//validate login to remeber the row
														boolean row = resultset.isBeforeFirst();

														if (row) {
															while (resultset.next()) {
																//out.print("<br> test : x <br>");
																int id = resultset.getInt("status_id");
																String name = resultset.getString("status_name");
																String descriptionr = resultset.getString("status_desc");
																out.println("<tr>");
																out.println("<td class='text-center'>" + " <input type='checkbox' name=" + id + " value=" + id
																		+ " /></td>");
																out.println("<td class='text-left'>" + name + "</td>");
																out.println("<td class='text-left'>" + descriptionr + "</td>");
																out.println("</tr>");
															}
														} else {
															response.sendRedirect("login.html" + "?IsSuccess=" + row);
														}
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 text-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"disabled\"><a href=\"#\">&laquo;</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">&raquo;</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 text-right\">Showing 1 to 20 of 38 (2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tPages)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start of <Fixed footer> -->\r\n");
      out.write("\t<footer id=\"footerMenu\"></footer>\r\n");
      out.write("\t<!-- End of <Fixed footer> -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/navlinks-admin.js\"></script>\r\n");
      out.write("\t<script src=\"js/footer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.10.2.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t<!-- load jQuery and tablesorter scripts -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-latest.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.tablesorter.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- tablesorter widgets (optional) -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.tablesorter.widgets.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t<!-- \tStart by telling tablesorter to sort your table when the document is loaded: -->\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"#myTable\").tablesorter();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"#myTable\").tablesorter({\r\n");
      out.write("\t\t\t\tsortList : [ [ 1, 0 ], [ 2, 0 ], ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
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
}
