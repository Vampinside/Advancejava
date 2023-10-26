package in.co.rays.test;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	
	public static void main(String[] args) throws Exception {
		
		// testAdd();
		//testAuthenticate();
		testUpdate();
	}

	private static void testUpdate() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		 UserBean bean = new UserBean();
		 UserModel model = new UserModel();
		 
		 bean.setFirstName("dipesh");
			bean.setLastName("gocher");
			bean.setLoginId("dipesh@gmail.com");
			bean.setPassword("123");
			bean.setDob(sdf.parse("2002-07-31"));
			bean.setAddress("indore");
			bean.setId(1);
			
			model.update(bean);	
		 
		
	}

	private static void testAuthenticate() throws Exception {
		 UserModel model = new UserModel();
		 UserBean bean = model.autheticate("dipesh@gmail.com", "123");
		 
		 if (bean!=null) {
			 
			 System.out.print(" "+bean.getId());
			 System.out.print(" "+bean.getFirstName());
			 System.out.print(" "+bean.getLastName());
			 System.out.print(" "+bean.getLoginId());
			 System.out.print(" "+bean.getPassword());
			 System.out.print(" "+bean.getDob());
			 System.out.println(" "+bean.getAddress());
			
		} else {
			System.out.println("user does not exist");
		}
		 
		 
		
	}

	private static void testAdd()throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		
		bean.setFirstName("nikhil");
		bean.setLastName("vivo");
		bean.setLoginId("nikhil@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2002-12-04"));
		bean.setAddress("indore");
		
		model.add(bean);	
	}
	
	
	

}
