import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Database;

/**
 * Servlet implementation class InsertCourse
 */
@WebServlet("/InsertWorkshop")
public class InsertWorkshop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
			
			 String courseName= null;
			 String courseDesc = null;
			 int courseStatus;
			 String courseCost = null;
			 String courseCat = null;
             int courseDuration;
			 courseName = request.getParameter("course_name");
             courseDesc = request.getParameter("course_description");
             courseCat = request.getParameter("category");
             courseStatus = Integer.parseInt(request.getParameter("status"));
             courseCost = request.getParameter("course_cost");
             courseDuration = Integer.parseInt(request.getParameter("duration"));
             
             
             
			// Execute SQL query
			final  Statement stmt = conn.createStatement();

			String sql;
			sql = "INSERT INTO `item` ( `item_name`, `item_desc`, `unit_cost`, `status_id`, `item_type_id`, `date_last_updated`, `item_duration` )VALUES ('"+courseName+"','"+courseDesc+"', '"+courseCost+"', '"+courseStatus+"', 2 ,CURDATE() , '"+courseDuration+"' )" ;
			int rs = stmt.executeUpdate(sql);
			String sql2;
			sql2 = "INSERT INTO `category_has_item` ( `category_id`, `item_id` )VALUES ('"+courseCat+"',LAST_INSERT_ID())" ;
			stmt.executeUpdate(sql2);
			
			if(rs == 1){


				
				response.sendRedirect("workshopAdmin.jsp");

			}
			else{
				//out.println("failed");
				response.sendRedirect("addWorkshop.jsp");

			}




			stmt.close();
			conn.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}



	}


}
