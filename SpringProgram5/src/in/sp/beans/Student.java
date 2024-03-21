package in.sp.beans;

public class Student {
	
	private String name;
	private int rollNo;
	private String email;
	private Address address;
	
	//declare constructor
	public Student(String name, int rollNo, String email, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
		this.address = address;
	}
	
	
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("rollNo:"+rollNo);
		System.out.println("email:"+email);
		System.out.println("address:"+address);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
