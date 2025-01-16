package org.dnyanyog;

public class SchoolManagement {
	
	public static void main(String []args) {
		Student std = new Student();
		
		std.setfirstName("Pankaj");
		std.setlastName("Dhanger");
		std.setAddress("yawal,jalgoan");
		std.setmobile("7796080929");
		
		//********* Address ********
		
		std.getaddress().setStreet1("Dhangar Wada");
		std.getaddress().setStreet2("sundar nagari");
		std.getaddress().setCity("pune");
		std.getaddress().setState("Maharastra");
		std.getaddress().setCountry("IND");
		std.getaddress().setPincode("425301");
	
	//	 System.out.println(std.getfirstName);
	//	 System.out.println(std.getlastName);
		
		System.out.println(std);
		
	}

}
