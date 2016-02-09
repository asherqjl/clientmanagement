/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-02-01 04:02:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class parenthomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main/parentNavigation.jsp", out, false);
      out.write("\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<title>I'MPOSSIBLE - Parent Page</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("<link href=\"css/home.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");

		//allow access only if session exists
		String user = null;

		String role=(String) session.getAttribute("role");
		String uid = null;
		 if(session.getAttribute("name") == null || session.getAttribute("role") == null || !role.equalsIgnoreCase("parent")){
		response.sendRedirect("login.html");
		}else user = (String) session.getAttribute("name");
		 uid = (String) session.getAttribute("uid");
		String userName = null;
		String sessionID = null;
		String userrole = null;
		String userID = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("name"))
					userName = cookie.getValue();
				if (cookie.getName().equals("JSESSIONID"))
					sessionID = cookie.getValue();
				if (cookie.getName().equals("role"))
					userrole = cookie.getValue();
				if (cookie.getName().equals("id"))
					userID = cookie.getValue();
			}
		} else {
			sessionID = session.getId();
		}

		/* no session validation logic in the above JSP. It contains link to another JSP page,  */
	
      out.write("\r\n");
      out.write("\t<h3>\r\n");
      out.write("\t\tHi\r\n");
      out.write("\t\t");
      out.print(userName);
      out.write(", Login successful. Your Session ID=");
      out.print(sessionID);
      out.write("\r\n");
      out.write("\t\trole=");
      out.print(userrole);
      out.write("</h3>\r\n");
      out.write("\t<br> User=");
      out.print(user);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<br> UserIDSession=");
      out.print(uid);
      out.write("\r\n");
      out.write("\t\t\t<br> UserIDCookie=");
      out.print(userID);
      out.write("\r\n");
      out.write("\t<br>role=");
      out.print(role);
      out.write("\r\n");
      out.write("\t<!-- need to encode all the URLs where we want session information to be passed -->\r\n");
      out.write("\t<a href=\"CheckoutPage.jsp\">Checkout Page</a>\r\n");
      out.write("\t<form action=\"LogoutServlet\" method=\"get\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Logout\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"padding-top: 100px; text-align: center\">\r\n");
      out.write("\t\t<div class=\"container marketing\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<img class=\"img-circle\" src=\"image/Diary-icon.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Generic placeholder image\" width=\"160\" height=\"160\">\r\n");
      out.write("\t\t\t\t\t<h2>Recent Journals</h2>\r\n");
      out.write("\t\t\t\t\t<p>View journals that your child have recently written and\r\n");
      out.write("\t\t\t\t\t\tcounsellor's commentss</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<img class=\"img-circle\" src=\"image/Courses-icon.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Generic placeholder image\" width=\"160\" height=\"160\">\r\n");
      out.write("\t\t\t\t\t<h2>My Courses</h2>\r\n");
      out.write("\t\t\t\t\t<p>View all Courses and Programs that I have registered.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<img class=\"img-circle\" src=\"image/profile-icon.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Generic placeholder image\" width=\"160\" height=\"160\">\r\n");
      out.write("\t\t\t\t\t<h2>My Information</h2>\r\n");
      out.write("\t\t\t\t\t<p>View my Information and edit my profile</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"ParentViewJournals.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\trole=\"button\">View Journals &raquo;</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"ParentCoursesNPrograms.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\trole=\"button\">View details &raquo;</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default\" href=\"ParentProfile.jsp\" role=\"button\">View My\r\n");
      out.write("\t\t\t\t\t\t\tInformation &raquo;</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- <Fixed footer> -->\r\n");
      out.write("\t\t<footer id=\"footerMenu\"></footer>\r\n");
      out.write("\t\t<!-- End <Fixed footer> -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"js/footer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
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
