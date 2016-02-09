

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER = "root";
	static final String PASS = "";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	

		 // JDBC driver name and database URL
	      final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
	      final String DB_URL="jdbc:mysql://localhost:3306/mydb";

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
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         String email = request.getParameter("inputEmail");
	         String password = request.getParameter("inputPassword");
	         out.print(email);
	         out.print(password);

	         // Execute SQL query
	       final  Statement stmt = conn.createStatement();
	         String sql;
	         sql = "Select user_id, role FROM user WHERE email = '"+email+"' and password = '"+password+"' " ;
	         ResultSet rs = stmt.executeQuery(sql);
	       //validate login to remember the row
	         boolean row = rs.isBeforeFirst();

	         if(row){
	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	            int id  = rs.getInt("user_id");
	           String role = rs.getString("role");
	          /*  String first = rs.getString("first");
	            String last = rs.getString("last");
*/
	            //Display values
	            out.println("ID: " + id + "<br>");
	            out.println(", role: " + role + "<br>");
	/*            out.println(", First: " + first + "<br>");
	            out.println(", Last: " + last + "<br>");*/
	         }
	         out.println("</body></html>");
	         
	         // Clean-up environment
	         rs.close();
	         stmt.close();
	         conn.close();
	         }else{
	        	 response.sendRedirect("login.html" + "?IsSuccess=" + row);
	        }
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
			


		} 
	}



