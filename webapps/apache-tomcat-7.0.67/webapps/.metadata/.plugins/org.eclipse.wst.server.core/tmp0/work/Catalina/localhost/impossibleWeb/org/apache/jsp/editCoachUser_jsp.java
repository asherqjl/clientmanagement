/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-02-02 16:38:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editCoachUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main/adminNavigations.jsp", out, false);
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      //  sql:query
      org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
      _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sql_005fquery_005f0.setParent(null);
      // /editCoachUser.jsp(10,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setVar("coachuser");
      // /editCoachUser.jsp(10,0) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataSource}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_push_body_count_sql_005fquery_005f0[0]++;
            _jspx_th_sql_005fquery_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_sql_005fquery_005f0.doInitBody();
          }
          do {
            out.write("\r\n");
            out.write("SELECT * \r\n");
            out.write("FROM  `user` , coach\r\n");
            out.write("WHERE user.coach_id = coach.coach_id\r\n");
            out.write("AND user.coach_id=");
            out.print(request.getParameter("coachID"));
            out.write("\r\n");
            out.write("\r\n");
            int evalDoAfterBody = _jspx_th_sql_005fquery_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_sql_005fquery_005f0[0]--;
          }
        }
        if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_005fquery_005f0.doFinally();
        _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

		//allow access only if session exists
		String user = null;
		if (session.getAttribute("name") == null || session.getAttribute("role") != ("admin")) {
			response.sendRedirect("login.jsp");
		} else
			user = (String) session.getAttribute("name");
		String userName = null;
		String sessionID = null;
		String userrole = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("name"))
					userName = cookie.getValue();
				if (cookie.getName().equals("JSESSIONID"))
					sessionID = cookie.getValue();
				if (cookie.getName().equals("role"))
					userrole = cookie.getValue();
			}
		} else {
			sessionID = session.getId();
		}

		/* no session validation logic in the above JSP. It contains link to another JSP page,  */
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<title>I'MPOSSIBLE - Admin Edit Coach User</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/home.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"ckeditor/ckeditor.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h1>Manage User</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"adminIndex.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"manageCoachUser.jsp\">Manage Coach </a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pencil\"></i>Edit Coach User\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start of <Fixed footer> -->\r\n");
      out.write("\t<footer id=\"footerMenu\"></footer>\r\n");
      out.write("\t<!-- End of <Fixed footer> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/footer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
    // /editCoachUser.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setVar("dataSource");
    // /editCoachUser.jsp(6,0) name = driver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
    // /editCoachUser.jsp(6,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost:3306/mydb");
    // /editCoachUser.jsp(6,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setScope("session");
    // /editCoachUser.jsp(6,0) name = user type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
    // /editCoachUser.jsp(6,0) name = password type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setPassword("");
    int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
    if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fscope_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /editCoachUser.jsp(91,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("coachU");
    // /editCoachUser.jsp(91,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/editCoachUser.jsp(91,6) '${coachuser.rows}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${coachuser.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<form action=\"editCoachUser\" method=\"post\"\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"form-horizontal\">\r\n");
          out.write("\r\n");
          out.write("<input type=\"hidden\" name=\"rdate\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.create_update_datetime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\t\t\t\t\t<input type=\"hidden\" name=\"Coachid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.coach_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"role\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t <input type=\"hidden\" name=\"userStatus\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.userStatus_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\" for=\"coach\">Salutation:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"salutation_input\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"salutation\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.salutation}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.salutation}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Mr\">Mr</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Mrs\">Mrs</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Ms\">Ms</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Mdm\">Mdm</option>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"csName\">Coach\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tSurname:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"csName\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.surname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cgName\">Coach\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tGiven name:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"cgName\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.given_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cEmail\">Coach\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tEmail:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"cEmail\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cPassword\">Password:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"password\" name=\"cPassword\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cMobile\">Mobile:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"tel\" name=\"cMobile\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.mobile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cAddress\">Address</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"cAddress\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cHR\">Coach\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tHourly Rate:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"cHR\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.coach_hourly_rate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cProfile\">Coach\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tProfile:</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"cProfile\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${coachU.coach_profile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Save\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tchanges</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"manageCoachUser.jsp\"><button type=\"button\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-danger\">Cancel</button></a>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</form>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
