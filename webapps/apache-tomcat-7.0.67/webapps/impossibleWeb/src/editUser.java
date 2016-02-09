

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Database;

/**
 * Servlet implementation class editUser
 */
@WebServlet("/editUser")
public class editUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public editUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

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
			String id =null;
			String saluation =null;
			String 	sname=null;
			String	gname =null;
			String	email =null;

			String	pw =null;
			String	mobile =null;
			String	address =null;
			String	uStatus =null;
			String	role =null;


			id= request.getParameter("id");
			uStatus= request.getParameter("userStatus");
			role= request.getParameter("role");
			saluation= request.getParameter("salutation");
			sname= request.getParameter("uName");
			gname= request.getParameter("ugName");
			email= request.getParameter("uEmail");
			pw= request.getParameter("uPassword");
			mobile= request.getParameter("uMobile");
			address= request.getParameter("uAddress");

			out.println(id); 
			out.println(saluation);
			out.println(sname);
			out.println(gname);
			out.println(email);

			out.println(pw);
			out.println(mobile);
			out.println(address);
			out.println(uStatus);
			out.println(role);

			String currentTime = request.getParameter("rdate");
			// Execute SQL query

			// Execute SQL query
			Statement stmt = null;

			stmt = conn.createStatement();
			// create the java mysql update preparedstatement

			int i= stmt.executeUpdate("UPDATE `user` SET`email`='"+email+"',`password`='"+pw+"',`surname`='"+sname+"',`given_name`='"+gname+"',`mobile`='"+mobile+"',`role`='"+role+"',`create_update_datetime`='"+currentTime+"',`salutation`='"+saluation+"',`address`='"+address+"',`userStatus_id`='"+uStatus+"' WHERE user_id='"+id+"'");











			if(i==1 ){
				response.sendRedirect("manageUser.jsp");

			}else{
				out.println("There is an error");

			}
			conn.close();
		}

		catch (Exception e) {
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


