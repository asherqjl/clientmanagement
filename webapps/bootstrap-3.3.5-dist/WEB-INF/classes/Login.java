
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	public static void main (String [] args){
		
	}
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// JDBC driver name and database URL
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
		final String DB_URL="jdbc:mysql://localhost/impossible";

		//  Database credentials
		final String USER = "root";
		final String PASS = "";


		String uN = request.getParameter("inputEmail");
		String uP = request.getParameter("inputPassword");

		try{
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Execute SQL query
			java.sql.Statement stmtse = conn.createStatement();
			

			// Extract data from result set
			String sqlse;
			//because n variable is a string so you need the '' if it is a integer you do not need to use the '' to cast it into a string
			sqlse = " SELECT password FROM user WHERE email = '" + uN + "'" ; 
			java.sql.ResultSet rs = stmtse.executeQuery(sqlse); 

			while(rs.next()){
				
				String checkPass = rs.getString("password");
				
				if(uP.equals(checkPass)){
					RequestDispatcher rd = request.getRequestDispatcher("register.html");
					rd.forward(request, response);

				} else {
					out.print("sorry wrong password");
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}

			}

			// Clean-up environment
			rs.close();
			stmtse.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	} //end try	
}
