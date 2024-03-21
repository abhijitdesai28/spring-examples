package in.sp.beans;

public class Address {
	private String city;
	private int pinCode;
	
	
	//declare constructor
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	
	
	@Override
	public String toString() {
		return "[city=" + city + ", pinCode=" + pinCode + "]";
	}


	

}
