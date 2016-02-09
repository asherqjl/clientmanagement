

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import dao.Database;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    
  


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try
		{
			// Register JDBC driver
			// JDBC driver name and database URL
			//  Database credentials

			Database database= new Database();

			// Open a connection
			Connection connection = database.Get_Connection();

			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = 
					new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);
		//parent
	  	String salutation = request.getParameter("psalutation");
	  	String sname = request.getParameter("psurname");
	  	String gname = request.getParameter("pgivenname");

	  	String contact_number = request.getParameter("pmobile");
	  	String address = request.getParameter("paddress");
	  	//String postal_code = request.getParameter("postal_code");
	  	String email = request.getParameter("pemail");
	  	String password = request.getParameter("ppassword");
	 

	  	//child
	  	String dob = request.getParameter("cdob");
	  	String school = request.getParameter("cschool");
	  	String relationship = request.getParameter("rtc");
	  	String salutation1 = request.getParameter("csalutation");
	  	String sname1 = request.getParameter("csurname");
	  	String gname1 = request.getParameter("cgivenname");


	  	String cmobile = request.getParameter("cmobile");
	  	String address1 = request.getParameter("caddress");
	  	//String postal_code1 = request.getParameter("postal_code1");
	  	String email1 = request.getParameter("cemail");
	  	String password1 = request.getParameter("cpassword");
	  	
		// Execute SQL query
		Statement stmt = null;
		Statement ustmt = null;
		Statement puser = null;
		Statement cuser = null;
		ResultSet rs = null;
		ResultSet crs = null;
		stmt = connection.createStatement();
		puser = connection.createStatement();

		cuser = connection.createStatement();
	ustmt= connection.createStatement();
	
	
		 stmt.executeUpdate("INSERT INTO `parent`() VALUES ()",Statement.RETURN_GENERATED_KEYS); 

			rs = stmt.getGeneratedKeys();
			while (rs.next()) {
				int key = rs.getInt(1);
				
				
	
				
				ustmt.executeUpdate("INSERT INTO `client`(`parent_id`, `client_dob`,`client_school`,  `relationship_to_child`) VALUES ('"+key+"','"+dob+"','"+school+"','"+relationship+"')",Statement.RETURN_GENERATED_KEYS);
				
			
				 crs = ustmt.getGeneratedKeys();
				 
					puser.executeUpdate("INSERT INTO `user`( `parent_id`, `email`, `password`, `surname`, `given_name`, `mobile`, `role`, `create_update_datetime`, `salutation`, `address`, `userStatus_id`) VALUES ('"+key+"','"+email+"','"+password+"', '"+sname+"', '"+gname+"' , '"+contact_number+"', 'parent', '"+currentTime+"', '"+salutation+"', '"+address+"','2')"); 
					while (crs.next()) {
						int ckey = crs.getInt(1);
					int i=	cuser.executeUpdate("INSERT INTO `user`( `client_id`, `email`, `password`, `surname`, `given_name`, `mobile`, `role`, `create_update_datetime`, `salutation`, `address`, `userStatus_id`) VALUES ('"+ckey+"','"+email1+"','"+password1+"', '"+sname1+"', '"+gname1+"' , '"+cmobile+"', 'child', '"+currentTime+"', '"+salutation1+"', '"+address1+"','2')"); 
						
					if(i==1){
						response.sendRedirect("manageUser.jsp");
					}
					else{
						out.println("failed");
					}
					}
	
				 crs.close();

			}
			rs.close();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("Error: " + e.getMessage());
		}
		finally
		{
			out.close();
		}
	}
		

}

