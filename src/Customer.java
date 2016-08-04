/**
 * Title: Customer.java
 * Abstract: Bank Application. (Homework 4)
 * Author: Arash Aria
 * ID: 4210
 * Date: 06/12/16
 */
public class Customer {
	
	private String name;
	private int ssn;
	private String address;
	
	
	
	public Customer(String name, int ssn, String address) {
		
		this.setName(name);
		this.setAddress(address);
		this.setSsn(ssn);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
