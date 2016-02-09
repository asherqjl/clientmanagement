

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Database;

/**
 * Servlet implementation class editUserStatus
 */
@WebServlet("/editUserStatus")
public class editUserStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editUserStatus() {
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

					String name =null;
					String 	desc=null;
					String	id=null;
					id= request.getParameter("id");
					name= request.getParameter("status_name");
					desc= request.getParameter("status_description");


					// create the java mysql update preparedstatement
					String query = "UPDATE `userstatus` SET `userstatus_name`= ?,`userstatus_desc`= ? WHERE `userStatus_id`=?";

					PreparedStatement preparedStmt = conn.prepareStatement(query);
					preparedStmt.setString  (1, name);
					preparedStmt.setString(2, desc);
					preparedStmt.setString(3, id);
					// execute the java preparedstatement
					int i = preparedStmt.executeUpdate();

					conn.close();
					if(i==1){
						response.sendRedirect("manageUserStatus.jsp");
					}else{
						out.println("There is an error");
						response.sendRedirect("manageUserStatus.jsp");
					}


				}

				catch (Exception e)
				{
					System.err.println("Got an exception! ");
					System.err.println(e.getMessage());
				}
			}
	

}
