package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	System.out.println("<h3> Request information Example<h3>");
	System.out.println("method :"+ req.getMethod());
	System.out.println("Request Uri :"+ req.getRequestURI());
	System.out.println("Protocol :"+ req.getProtocol());
	System.out.println("Remote address :"+ req.getRemoteAddr());
		
	}
	
	
	
	

}
