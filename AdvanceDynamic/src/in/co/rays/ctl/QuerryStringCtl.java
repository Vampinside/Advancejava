package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/QuerryStringCtl")
public class QuerryStringCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println( "this is do get");
		
//		String str = req.getParameter("Name");
//	String ads = 	req.getParameter("Address");
//	
//		System.out.println("name = "+ str);
//		System.out.println("address = "+ads);
		
		}
		
		
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("this is post method");
	}
	

}
