package in.com.practiceA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PTestmethod {
	

	public static void main(String[] args) throws Exception {

		 add(8, "Damon", 6000);
	}
	
	private static void add(int id, String name, int salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into emp3 values(" + id + ", '" + name + "', " + salary + ")");

		System.out.println("Data inserted " + i);

	}
}
	
	
//
//		testSelect();
//
//        }
//
//	private static void testSelect() throws Exception {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
//
//		Statement stmt = conn.createStatement();
//
//		ResultSet rs = stmt.executeQuery("select * from emp3");
//
//		while (rs.next()) {
//
//		System.out.print(rs.getInt(1));
//			System.out.print("\t" + rs.getString(2));
//			System.out.println("\t" + rs.getInt(3));
//
//		}
//
//	
//	}
//	
	




	