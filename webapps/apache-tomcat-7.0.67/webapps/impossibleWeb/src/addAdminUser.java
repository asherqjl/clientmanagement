

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Database;


/**
 * Servlet implementation class addAdminUser
 */
@WebServlet("/addAdminUser")
public class addAdminUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addAdminUser() {
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


			String sname =null;

			String gname =null;
			String salutation =null;


			String email =null;
			String pw=null;

			String pn=null;
			String add =null;

			String status =null;

			sname=request.getParameter("sName");
			gname=request.getParameter("gName");
			salutation=request.getParameter("salutation");

			email=request.getParameter("aEmail");

			pw=	request.getParameter("aPassword");


			pn=request.getParameter("aMobile");


			add=request.getParameter("aAddress");

			status=request.getParameter("status");
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = 
					new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);

			// Execute SQL query
			Statement stmt = null;

			Statement user = null;
			ResultSet rs = null;
			stmt = connection.createStatement();
			user = connection.createStatement();  


			 stmt.executeUpdate("INSERT INTO `user`(  `email`, `password`, `surname`, `given_name`, `mobile`, `role`, `create_update_datetime`, `salutation`, `address`, `userStatus_id`) VALUES ('"+email+"','"+pw+"', '"+sname+"', '"+gname+"' , '"+pn+"', 'admin', '"+currentTime+"', '"+salutation+"', '"+add+"','"+status+"')",Statement.RETURN_GENERATED_KEYS); 

			rs = stmt.getGeneratedKeys();
			while (rs.next()) {
				int key = rs.getInt(1);
				user.executeUpdate("INSERT INTO `user_has_role`(`role_id`, `user_id`) VALUES ('1','"+key+"')"); 

				response.sendRedirect("manageAdminUser.jsp");


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

