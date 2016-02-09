

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayImage
 */
@WebServlet("/DisplayImage")
public class DisplayImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayImage() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    Blob photo = null;
	
	    Statement stmt = null;
	    ResultSet rs = null;

	    String query = "SELECT `banner_image_id`, `banner_image` FROM `banner_image` WHERE `banner_image_id` = '2' ";
	    ServletOutputStream out = response.getOutputStream();
    	String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/mydb";
	    String username = "root";
	    String password = "";

	    try {
	    	
	    	
	    	
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	    try {
			

		    Connection conn = DriverManager.getConnection(url, username, password);
	      stmt = conn.createStatement();
	      rs = stmt.executeQuery(query);
	      if (rs.next()) {
	        photo = rs.getBlob(1);
	      } else {
	        response.setContentType("text/html");
	        out.println("<html><head><title>Person Photo</title></head>");
	        out.println("<body><h1>No photo found for id= 001 </h1></body></html>");
	        return;
	      }

	      response.setContentType("image/gif");
	      InputStream in = photo.getBinaryStream();
	      int length = (int) photo.length();

	      int bufferSize = 1024;
	      byte[] buffer = new byte[bufferSize];

	      while ((length = in.read(buffer)) != -1) {
	        System.out.println("writing " + length + " bytes");
	        out.write(buffer, 0, length);
	      }

	      in.close();
	      out.flush();
	    } catch (SQLException e) {
	      response.setContentType("text/html");
	      out.println("<html><head><title>Error: Person Photo</title></head>");
	      out.println("<body><h1>Error=" + e.getMessage() + "</h1></body></html>");
	      return;
	    } finally {
	      try {
	        rs.close();
	        stmt.close();
	        conn.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }

	

	 


	}


