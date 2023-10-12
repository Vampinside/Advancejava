package in.com.practiceA;

import java.util.Iterator;
import java.util.List;

public class PTestMarksheet {

	public static void main(String[] args) throws Exception {
		
	//	testAdd();
	 // testUpdate();
    //	testDelete();
		// testFindById();
		testSearch();
	 }
	
	
	                      //   (for search)
	
	
	     private static void testSearch() throws Exception {
	    	 
	    	 PMarksheetModel model = new PMarksheetModel();
	    	 
	    	 List list = model.search();
	    	 
	    	 Iterator it = list.iterator();
	    	 
	    	 while (it.hasNext()) {
	    		 
	    		 PMarksheetBean bean = (PMarksheetBean) it.next();
	    		 
	    		 System.out.print(" "+bean.getId());
	    		 System.out.print(" "+bean.getName());
	    		 System.out.print(" "+bean.getRollno());
	    		 System.out.print(" "+bean.getChemistry());
	    		 System.out.print(" "+bean.getPhysics());
	    		 System.out.println(" "+bean.getMaths());
				
			}
		
		
	}

							// (find by id)
	
	 private static void testFindById() throws Exception {
		 
		 PMarksheetModel model = new PMarksheetModel();
		 
		 PMarksheetBean bean = model.findById(6);
		 
		 if(bean != null) {
			 
			 System.out.print(" "+bean.getId());
			 System.out.print(" "+bean.getName());
			 System.out.print(" "+bean.getRollno());
			 System.out.print(" "+bean.getChemistry());
			 System.out.print(" "+bean.getPhysics());
			 System.out.println(" "+bean.getMaths());
			 
		 } else {
			 System.out.println("id doesn't exist");
		 }		
	 }

						// (for delete)
	
	private static void testDelete() throws Exception {
		
		PMarksheetModel model = new PMarksheetModel();
		
		model.delete(7);
	
	}

	
	                       // (for add)
	
	private static void testAdd() throws Exception {
		
		PMarksheetBean bean = new PMarksheetBean();
		PMarksheetModel model = new PMarksheetModel();
		
		
		bean.setId(7);
		bean.setName("mina");
		bean.setRollno(107);
		bean.setChemistry(82);
		bean.setPhysics(68);
		bean.setMaths(48);
			
		model.add(bean);
	}
	
	
	
	
	                        // (for update)

	private static void testUpdate() throws Exception{
		
		PMarksheetBean bean = new PMarksheetBean();
		PMarksheetModel model = new PMarksheetModel();
		
		bean.setId(6);
		bean.setName("mohit");
		bean.setRollno(106);
		bean.setChemistry(56);
		bean.setPhysics(39);
		bean.setMaths(92);
		
		model.Update(bean);
	}
	}


	
	

	
	
		
		
		
		
