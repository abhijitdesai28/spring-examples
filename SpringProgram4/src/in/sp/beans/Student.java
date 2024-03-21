package in.sp.beans;

public class Student {
	
	private String name;
	private int rollNo;
	private String email;
	private Address address;
	
	//declare setter methods
	
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("rollNo:"+rollNo);
		System.out.println("email:"+email);
		System.out.println("address:"+address);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
