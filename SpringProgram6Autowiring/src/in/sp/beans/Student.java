package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int rollNo;
	private String email;
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("rollNo:"+rollNo);
		System.out.println("email:"+email);
		System.out.println("address:"+address);
	}
	
	

}
