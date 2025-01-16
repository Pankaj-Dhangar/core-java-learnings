package org.dnyanyog;

public class Student {
	
	private String firstName;
	private String lastName;
	private String Address;
	private String mobile;
	
	
	private String year;
	private String branch;
	
	private Address address = new Address();  // give address to the object 
	                                          // if cannot create new object for Address o/p is (Address is Null)
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getmobile() {
		return mobile;
	}
	public void setmobile(String mobile) {
		this.mobile = mobile;
	}
	public String getyear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	public org.dnyanyog.Address getaddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + Address + ", mobile="
				+ mobile + ", Year=" + year + ", branch=" + branch + ", address=" + address + "]";
	}
	
	

}
