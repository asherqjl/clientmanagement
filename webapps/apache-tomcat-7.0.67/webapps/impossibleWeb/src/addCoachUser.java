

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Database;

/**
 * Servlet implementation class addCoachUser
 */
@WebServlet("/addCoachUser")
public class addCoachUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addCoachUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();



		try{
			// Register JDBC driver
			// JDBC driver name and database URL
			//  Database credentials

			Database database= new Database();

			// Open a connection
			Connection conn = database.Get_Connection();


			String sname =null;

			String gname =null;
			String salutation =null;
			String desc=null;

			String email =null;
			String pw=null;
			String cpw =null;
			String pn=null;
			String add =null;
			String hr=null;
			String status =null;

			sname=request.getParameter("sName");
			gname=request.getParameter("gName");
			salutation=request.getParameter("salutation");
			desc=request.getParameter("cDesc");
			email=request.getParameter("cEmail");

			pw=	request.getParameter("cPassword");


			cpw=request.getParameter("confirmPassword" );

			pn=request.getParameter("cMobile");


			add=request.getParameter("cAddress");
			hr=request.getParameter("cHourlyRate");

			status=request.getParameter("status");


			out.println("Your Text = "+sname+"<br>");
			out.println("Your Text = "+gname+"<br>");
			out.println("Your Text = "+desc+"<br>");
			out.println("Your Text = "+email+"<br>");
			out.println("Your Text = "+pw+"<br>");
			out.println("Your Text = "+cpw+"<br>");
			out.println("Your Text = "+pn+"<br>");
			out.println("Your Text = "+add+"<br>");
			out.println("Your Text = "+hr+"<br>");
			out.println("Your Text = "+status+"<br>");
			java.util.Date dt = new java.util.Date();

			java.text.SimpleDateFormat sdf = 
					new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);
			// Execute SQL query
			Statement stmt = null;
			Statement user = null;
			stmt = conn.createStatement();

			user = conn.createStatement();  
			ResultSet rs = null;
			int i = stmt.executeUpdate("INSERT INTO `coach`(`coach_hourly_rate`, `coach_profile`) VALUES ('"+hr+"','"+desc+"')",Statement.RETURN_GENERATED_KEYS); 



			//validate login to remember the row

			out.println(i);


			rs = stmt.getGeneratedKeys();
			while (rs.next()) {
				int key = rs.getInt(1);
				System.out.println("Key returned from getGeneratedKeys():"
						+ rs.getInt(1));

				user.executeUpdate("INSERT INTO `user`( `coach_id`, `email`, `password`, `surname`, `given_name`, `mobile`, `role`, `create_update_datetime`, `salutation`, `address`, `userStatus_id`) VALUES ('"+key+"','"+email+"','"+pw+"', '"+sname+"', '"+gname+"' , '"+pn+"', 'coach', '"+currentTime+"', '"+salutation+"', '"+add+"','"+status+"')"); 
				response.sendRedirect("manageCoachUser.jsp");
				
			} 
			rs.close();
		








		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
}


