package in.com.practiceA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PTestCurd {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
	
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate("insert into emp3 values(3, 'shubham', 2000)");
	System.out.println("Data inserted  "+ i);
}
}
