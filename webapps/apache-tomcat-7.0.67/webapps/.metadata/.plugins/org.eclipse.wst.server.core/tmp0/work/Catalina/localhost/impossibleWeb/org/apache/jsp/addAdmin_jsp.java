/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-01-27 03:39:31 UTC
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

public final class addAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


//parent
String salutation = request.getParameter("salutation");
String sname = request.getParameter("sname");
String gname = request.getParameter("gname");
String gender = request.getParameter("gender");
String country = request.getParameter("country");
String contact_number = request.getParameter("contact_number");
String address = request.getParameter("address");
String postal_code = request.getParameter("postal_code");
String email = request.getParameter("email");
String password = request.getParameter("password");

//child
String dob = request.getParameter("dob");
String relationship = request.getParameter("relationship");
String salutation1 = request.getParameter("salutation1");
String sname1 = request.getParameter("sname1");
String gname1 = request.getParameter("gname1");
String gender1 = request.getParameter("gender1");
String country1 = request.getParameter("country1");
String contact_number1 = request.getParameter("contact_number1");
String address1 = request.getParameter("address1");
String postal_code1 = request.getParameter("postal_code1");
String email1 = request.getParameter("email1");
String password1 = request.getParameter("password1");
/* out.println(country);

out.println(address);

out.println(sname); */

Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
Statement st= con.createStatement();
final Statement ut= con.createStatement();
final Statement ct= con.createStatement();
final Statement cut= con.createStatement();

//ResultSet rs;


st.executeUpdate("INSERT INTO `parent`() VALUES ()", Statement.RETURN_GENERATED_KEYS);

ResultSet rs = st.getGeneratedKeys();

int autoIncValue = -1;

if(rs.next()) 
{
       autoIncValue = rs.getInt(1);
     
  
       /*You can get more generated keys if they are generated in your code*/
  	out.println(autoIncValue);
  	ut.executeUpdate("INSERT INTO user(`parent_id`,`email`,`password`,`surname`,`given_name`,`mobile`,`role`,`salutation`,`address`,`country`,`userStatus_id`,`gender`,`postal_code`) VALUES ('"+autoIncValue+"', '"+email+"', '"+password+"', '"+ sname +"', '"+ gname +"', '"+ contact_number +"', 'parent', '"+ salutation +"', '"+ address +"', '"+ country+"', '1', '"+gender+"', '"+postal_code+"');");
  	ct.executeUpdate("INSERT INTO `client`(`parent_id`,`client_dob`,`relationship_to_child`) VALUES ('"+autoIncValue+"','"+dob+"','"+relationship+"')", Statement.RETURN_GENERATED_KEYS);
  	ResultSet cs = ct.getGeneratedKeys();

  	int autoChildIncValue = -1;
  	if(cs.next()) 
  	{
  		autoChildIncValue = cs.getInt(1);
  	 	cut.executeUpdate("INSERT INTO user(`client_id`,`email`,`password`,`surname`,`given_name`,`mobile`,`role`,`salutation`,`address`,`country`,`userStatus_id`,`gender`,`postal_code`) VALUES ('"+ autoChildIncValue+"', '"+email1+"', '"+password1+"', '"+ sname1 +"', '"+ gname1 +"', '"+ contact_number1 +"', 'client', '"+ salutation1 +"', '"+ address1 +"', '"+ country1+"', '12', '"+gender1+"', '"+postal_code1+"');");
  	}
  	response.sendRedirect("welcome.jsp");
}

else {
    response.sendRedirect("index.html");
}


/*int i=st.executeUpdate("INSERT INTO `parent`() VALUES ()"); 
out.println(i);

if(i>0){
	int id =st.executeUpdate("SELECT LAST_INSERT_ID()");
	out.println(id);
	 response.sendRedirect("welcome.jsp");
} else {
    response.sendRedirect("index.html");
}*/




      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
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
