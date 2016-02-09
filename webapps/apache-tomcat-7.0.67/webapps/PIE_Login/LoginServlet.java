 package pie.servlets.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import pie.Address;
import pie.Staff;
import pie.Student;
import pie.User;
import pie.constants.LoginResult;
import pie.constants.SupportedPlatform;
import pie.services.AuthService;
import pie.services.StaffService;
import pie.services.StudentService;
import pie.services.UserService;
import pie.utilities.Utilities;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 483038783219697909L;

	StaffService staffService;
	StudentService studentService;
	UserService userService;
	AuthService authService;

	@Inject
	public LoginServlet(UserService userService, AuthService authService, StaffService staffService, StudentService studentService) {
		this.userService = userService;
		this.authService = authService;
		this.staffService = staffService;
		this.studentService = studentService;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userEmail = null;
		String userPassword = null;
		int clientPlatformID = 0;
		
		try {
			
			Map<String, String> requestParameters = Utilities.getParameters(request, "userEmail", "userPassword", "platformID");
			userEmail = requestParameters.get("userEmail");
			userPassword = requestParameters.get("userPassword");
			clientPlatformID = Integer.parseInt(requestParameters.get("platformID"));
			
		} catch (Exception e) {
			
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
			
		SupportedPlatform clientPlatform = SupportedPlatform.getSupportedPlatform(clientPlatformID);

		LoginResult loginResult = userService.loginUser(userEmail, userPassword, clientPlatform);
		
		JSONObject responseObject = new JSONObject();
		responseObject.put("result", loginResult.toString());
		responseObject.put("message", loginResult.getDefaultMessage());
		
		if (loginResult == LoginResult.SUCCESS) {
			
			User user = userService.getUser(userService.getUserID(userEmail));
			Address userAddress = user.getUserAddress();
			
			JSONObject userJSON = new JSONObject();
			userJSON.put("userID", user.getUserID());
			userJSON.put("userFirstName", user.getUserFirstName());
			userJSON.put("userLastName", user.getUserLastName());
			userJSON.put("userType", user.getUserType().toString());
			userJSON.put("userEmail", user.getUserEmail());
			userJSON.put("userMobile", user.getUserMobile());
			userJSON.put("userAddressStreetName", userAddress.getAddressStreet());
			userJSON.put("userAddressPostalCode", userAddress.getAddressPostalCode());
			userJSON.put("userAddressCityID", userAddress.getAddressCity().getCityID());
			userJSON.put("userSecurityQuestionID", user.getUserSecurityQuestion().getSecurityQuestionID());
			userJSON.put("userSecurityQuestionAnswer", user.getUserSecurityAnswer());
			userJSON.put("userLastUpdate", Utilities.toUnixSeconds(user.getUserLastUpdate()));
			
			switch(user.getUserType()) {
				case STAFF: {
					
					Staff userStaff = staffService.getStaff(user.getUserID());
					userJSON.put("schoolID", userStaff.getSchool().getSchoolID());
					userJSON.put("schoolName", userStaff.getSchool().getSchoolName());
					userJSON.put("staffTitle", userStaff.getStaffTitle());
					userJSON.put("staffIsSchoolAdmin", userStaff.staffIsSchoolAdmin());
					break;
				}
				case STUDENT: {
					
					Student userStudent = studentService.getStudent(user.getUserID());
					userJSON.put("schoolID", userStudent.getSchool().getSchoolID());
					userJSON.put("schoolName", userStudent.getSchool().getSchoolName());
					userJSON.put("studentCode", userStudent.getStudentCode());
					userJSON.put("studentEnlistmentDateUnix", Utilities.toUnixSeconds(userStudent.getStudentEnlistmentDate()));
					break;
				}
				case ADMIN: {
					
					break;
				}
				case PARENT: {
					
					break;
				}
			}
			
			HashMap<String,Object> claims = new HashMap<String,Object>();
			claims.put("userID", new Integer(user.getUserID()));
			claims.put("userTypeID", new Integer(user.getUserType().getUserTypeID()));
			String token = authService.createToken("login", 86400000, claims);
			
			responseObject.put("user", userJSON);
			response.addHeader("X-Auth-Token", token);
		}
		
		PrintWriter out = response.getWriter();
		out.write(responseObject.toString());
		
		response.addHeader("Access-Control-Expose-Headers", "X-Auth-Token");
	}
}