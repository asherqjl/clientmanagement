package model;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dto.CategoryObjects;
import dao.catProject;
public class ProjectCategory {
 

	public ArrayList<CategoryObjects>  GetCategory(Connection connection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ArrayList<CategoryObjects> category = null;
		try{
			catProject projectcat = new catProject();
			category=projectcat.GetCategory(connection, request, response);
			
		}catch (Exception e){
			throw e;
		}
		return category;
	}
}
