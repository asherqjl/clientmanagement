

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
 * Servlet implementation class editContactUs
 */
@WebServlet("/editContactUs")
public class editContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editContactUs() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				try
				{
					// Register JDBC driver
					// JDBC driver name and database URL
					//  Database credentials

					Database database= new Database();

					// Open a connection
					Connection connection = database.Get_Connection();

					String id =null;
					String address =null;

					String pc =null;
					String country_code =null;


					String email =null;
					String direction=null;
					id=request.getParameter("cu");
			

					address=request.getParameter("address");
					pc=request.getParameter("pn");
					country_code=request.getParameter("country_code");


					email=	request.getParameter("email");


					direction=request.getParameter("direction");


				

			
			

		


						
						// create the java mysql update preparedstatement
						String query = "UPDATE `control` SET `office_address`= ?,`office_tel_number`= ?,`country_code`= ?,`office_email`= ? , `office_directions`=? WHERE `control_id`=?";

						PreparedStatement preparedStmt = connection.prepareStatement(query);
						preparedStmt.setString  (1, address);
						preparedStmt.setString(2, pc);
						preparedStmt.setString(3, country_code);
						preparedStmt.setString(4, email);
						preparedStmt.setString(5, direction);
						preparedStmt.setString(6, id);
						// execute the java preparedstatement
						int i = preparedStmt.executeUpdate();

						connection.close();
						if(i==1){
							response.sendRedirect("manageContactUs.jsp");
						}else{
							out.println("There is an error");
							response.sendRedirect("editContactUs.jsp");
						}
			



				} catch (Exception e) {
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


