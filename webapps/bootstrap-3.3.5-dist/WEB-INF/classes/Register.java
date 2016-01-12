package ServletTry;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// JDBC driver name and database URL
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
		final String DB_URL="jdbc:mysql://localhost/TEST";

		//  Database credentials
		final String USER = "root";
		final String PASS = "";

		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Database Result";
		String docType =
				"<!doctype html public \"-//w3c//dtd html 4.0 " +
						"transitional//en\">\n";
		out.println(docType +
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body bgcolor=\"#f0f0f0\">\n" +
				"<h1 align=\"center\">" + title + "</h1>\n");
		try{
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Execute SQL query
			java.sql.Statement stmt = conn.createStatement();
			java.sql.Statement stmtse = conn.createStatement();

			String sqlin;
			String sqlse;
			sqlin = " INSERT INTO employees VALUES (1111,18,'s','fdsa')";
			int  se = stmt.executeUpdate(sqlin);
			sqlse = " SELECT * FROM employees";
			java.sql.ResultSet rs = stmtse.executeQuery(sqlse);
			// Extract data from result set
			while(rs.next()){
				
				//Retrieve by column name
				int id  = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				//Display values
				out.println("ID: " + id + "<br>");
				out.println(", Age: " + age + "<br>");
				out.println(", First: " + first + "<br>");
				out.println(", Last: " + last + "<br>");
			}
			out.println("</body></html>");

			// Clean-up environment
			rs.close();
			stmt.close();
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


