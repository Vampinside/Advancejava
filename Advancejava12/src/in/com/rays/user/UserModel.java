package in.com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserModel {
	
	
	public Integer nextPk() throws Exception{
		int pk = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("select max(id) from user");
		
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		
		pk = rs.getInt(1);
	}	
		return pk+1;
		
		
	}

}
