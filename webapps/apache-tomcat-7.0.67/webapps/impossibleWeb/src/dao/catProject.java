package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dto.CategoryObjects;

public class catProject {
	
	public ArrayList<CategoryObjects>GetCategory(Connection connection,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		ArrayList<CategoryObjects>categoryData = new ArrayList<CategoryObjects>();
		try{
			PreparedStatement ps = connection.prepareStatement("SELECT `category_id`, `category_name`, `category_desc` FROM `category` ORDER BY `category_id` ASC");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				CategoryObjects catObject = new CategoryObjects();
				catObject.setCategory_id(rs.getString("category_id"));
				catObject.setCategory_name(rs.getString("category_name"));
				catObject.setCategory_desc(rs.getString("category_desc"));
				categoryData.add(catObject);
			}
			return categoryData;
		}
		catch(Exception e){
			throw e;
		}
	}

}
