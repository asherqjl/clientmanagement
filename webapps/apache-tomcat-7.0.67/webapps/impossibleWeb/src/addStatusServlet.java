

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
 * Servlet implementation class addStatusServlet
 */
@WebServlet("/addStatusServlet")
public class addStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStatusServlet() {
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


			String name =null;
			String desc=null;
			name= request.getParameter("status_name");
			desc= request.getParameter("status_description");
		
			out.println("Your Text = "+name+"<br>");
			out.println("Your Text = "+desc+"<br>");

			// Execute SQL query
			final  Statement stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO `status`( `status_name`, `status_desc`) VALUES ('"+name+"','"+desc+"') " ;
			int rs = stmt.executeUpdate(sql);
			//validate login to remember the row

			if(rs == 1){


				out.println("success");
				response.sendRedirect("manageItemStatus.jsp");
			}
			else{
				out.println("failed");
				response.sendRedirect("addItemStatus.jsp");

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
