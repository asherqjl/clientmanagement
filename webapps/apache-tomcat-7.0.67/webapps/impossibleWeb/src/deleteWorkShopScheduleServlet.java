

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
 * Servlet implementation class deleteWorkShopScheduleServlet
 */
@WebServlet("/deleteWorkShopScheduleServlet")
public class deleteWorkShopScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public deleteWorkShopScheduleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
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
			String[] wseID= request.getParameterValues("wseID");

			/*		for(int i=0;i<catID.length;i++){
			if(i==0) {
				catString = catString + "'" +(String)catID[i] + "'"; 
			}else{ 
					catString = catString + ",'" + (String)catID[i] + "'"; 
				} 
		}
		out.println(catString);

			 */
			String query;
			String query1;

			int rs =0;

			for(String id: wseID){

				query1 = " DELETE FROM `itemrun_has_client` WHERE  `itemrun_id` IN ('"+id+"')";
				stmt.executeUpdate(query1);
				query = "	 DELETE FROM `itemrun` WHERE   `itemrun_id` IN ('"+id+"')";
				// execute the preparedstatement



				rs =  stmt.executeUpdate(query);
			}



			if(rs==1){
				response.sendRedirect("manageWorkShopSchedule.jsp");

			}else{
				out.println("There is an error");
				response.sendRedirect("manageWorkShopSchedule.jsp");


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
