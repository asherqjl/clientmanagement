

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletDirect
 */
@WebServlet("/servletDirect")
public class servletDirectProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletDirectProgram() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String direct = request.getParameter("direct");
        String id = request.getParameter("selected");
        
        if(direct != null) {
            if(direct.equals("Delete")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("deleteServletProgram");
                dispatcher.forward(request, response);
            }
            else if(direct.equals("Edit")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("editProgram.jsp");
                dispatcher.forward(request, response);
            }
        }
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
