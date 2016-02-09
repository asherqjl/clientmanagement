
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class writecoachnotes
 */
@WebServlet("/writecoachnotes")
public class writecoachnotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public writecoachnotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER = "root";
	static final String PASS = "";

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String DB_URL = "jdbc:mysql://localhost:3306/mydb";

		// Database credentials
		final String USER = "root";
		final String PASS = "";

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		try {
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String textarea = request.getParameter("name");
			String counsellorcomment = request.getParameter("message");
			String coachID = request.getParameter("thisisthecoachid");
			String useridofchild = request.getParameter("Student");

			// Date format (USER table - parent)
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(dt);

			out.println("Your Text = " + textarea + "<br>");
			out.println("Your Text = " + counsellorcomment + "<br>");

			// Execute SQL query
			final Statement stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO `coach_note`(`coach_id`, `client_id`, `note_details`, `create_update_datetime`) VALUES ('"
					+ coachID + "', '" + useridofchild + "','" + counsellorcomment + "','" + currentTime + "') ";
			int rs = stmt.executeUpdate(sql);
			// validate login to remember the row

			if (rs == 1) {
				response.sendRedirect("counsellor.jsp");
			} else {
				out.println("failed");
				response.sendRedirect("addCategory.html");

			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

	}

}
