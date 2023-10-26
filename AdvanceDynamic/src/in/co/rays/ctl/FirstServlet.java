package in.co.rays.ctl;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("this is get servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is post method");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String fname = req.getParameter("firstName");
	String lname = 	req.getParameter("lastName");
	String login = 	req.getParameter("loginId");
	String pwd = 	req.getParameter("password");
	String dob = 	req.getParameter("Dob");
	String ads = 	req.getParameter("address");
	
	UserBean bean = new UserBean();
	
	bean.setFirstName(fname);
	bean.setLastName(lname);
    bean.setLoginId(login);
    bean.setPassword(pwd);
    try {
		bean.setDob(sdf.parse("2002-07-31"));
	} catch (ParseException e) {
		e.printStackTrace();
	}
    bean.setAddress(ads);
    
    
    
    UserModel model = new UserModel();
    try {
		model.add(bean);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	
    
//    resp.setContentType("text/html");
//		 PrintWriter out = resp.getWriter();
//		 
//		 out.write("<h1> hello guyzz</h1>");
//		 out.close();
	}
	


}
