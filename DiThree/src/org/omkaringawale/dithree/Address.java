package org.omkaringawale.dithree;

public class Address {

	private String district;
	private String state;
	private String country;
	
	public Address(String district, String state, String country) {
		super();
		this.district = district;
		this.state = state;
		this.country = country;
	}
	
	public void displayAddress(){
		System.out.println("********* Address ************");
		System.out.println(district + " : " + state + " : " + country);
		System.out.println("******************************");
	}

}
