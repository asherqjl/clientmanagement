

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
 * Servlet implementation class DeleteCounsellorComment
 */
@WebServlet("/DeleteCounsellorComment")
public class DeleteCounsellorComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCounsellorComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =  response.getWriter();
		try
		{
			// Register JDBC driver
			// JDBC driver name and database URL
			//  Database credentials

			Database database= new Database();

			// Open a connection
			Connection connection = database.Get_Connection();
			Statement stmt = null;
			stmt = connection.createStatement();
			String[] journalID= request.getParameterValues("journalID");
			
			//Date format (USER table - parent)
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf =  new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(dt);
	
			String query1;
		
			int rs =0;
		
			for(String id: journalID){
	
				 query1 = "UPDATE client_journal SET coach_comment = 'empty', coach_comment_datetime = '"+currentTime+"'"
				 		+ "WHERE `client_journal_id` = ("+id+")";
				
				/* stmt.executeUpdate(query1);*/
			
				 rs =  stmt.executeUpdate(query1);
			}



			if(rs ==1){
				//response.sendRedirect("manageUser.jsp");
				out.println("success");

			}else{
			out.println("There is an error");
			//response.sendRedirect("manageUser.jsp");


		}
			stmt.close();
			connection.close();

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	
	}
	

}
