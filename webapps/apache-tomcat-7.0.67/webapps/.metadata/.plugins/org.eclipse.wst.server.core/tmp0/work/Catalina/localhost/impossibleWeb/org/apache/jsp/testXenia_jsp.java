/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-01-31 22:15:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class testXenia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Book Query</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1>Another E-Bookstore</h1>\r\n");
      out.write("  <h3>Choose Author(s):</h3>\r\n");
      out.write("  <form method=\"get\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"author\" value=\"Tan Ah Teck\">Tan\r\n");
      out.write("    <input type=\"checkbox\" name=\"author\" value=\"Mohd Ali\">Ali\r\n");
      out.write("    <input type=\"checkbox\" name=\"author\" value=\"Kumar\">Kumar\r\n");
      out.write("    <input type=\"submit\" value=\"Query\">\r\n");
      out.write("  </form>\r\n");
      out.write(" \r\n");
      out.write("  ");

    String[] authors = request.getParameterValues("author");
    if (authors != null) {
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");

      Connection conn = DriverManager.getConnection(
  			"jdbc:mysql://localhost:3306/mydb", "root", ""); // <== Check!
      // Connection conn =
      //    DriverManager.getConnection("jdbc:odbc:eshopODBC");  // Access
      Statement stmt = conn.createStatement();
 
      String sqlStr = "SELECT * FROM books WHERE author IN (";
      sqlStr += "'" + authors[0] + "'";  // First author
      for (int i = 1; i < authors.length; ++i) {
         sqlStr += ", '" + authors[i] + "'";  // Subsequent authors need a leading commas
      }
      sqlStr += ") AND qty > 0 ORDER BY author ASC, title ASC";
 
      // for debugging
      System.out.println("Query statement is " + sqlStr);
      ResultSet rset = stmt.executeQuery(sqlStr);
  
      out.write("\r\n");
      out.write("      <hr>\r\n");
      out.write("      <form method=\"get\" action=\"order.jsp\">\r\n");
      out.write("        <table border=1 cellpadding=5>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>Order</th>\r\n");
      out.write("            <th>Author</th>\r\n");
      out.write("            <th>Title</th>\r\n");
      out.write("            <th>Price</th>\r\n");
      out.write("            <th>Qty</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("  ");

      while (rset.next()) {
        int id = rset.getInt("id");
  
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><input type=\"checkbox\" name=\"id\" value=\"");
      out.print( id );
      out.write("\"></td>\r\n");
      out.write("            <td>");
      out.print( rset.getString("author") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( rset.getString("title") );
      out.write("</td>\r\n");
      out.write("            <td>$");
      out.print( rset.getInt("price") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( rset.getInt("qty") );
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("  ");

      }
  
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"Order\">\r\n");
      out.write("        <input type=\"reset\" value=\"Clear\">\r\n");
      out.write("      </form>\r\n");
      out.write("      <a href=\"");
      out.print( request.getRequestURI() );
      out.write("\"><h3>Back</h3></a>\r\n");
      out.write("  ");

      rset.close();
      stmt.close();
      conn.close();
    }
  
      out.write("\r\n");
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
