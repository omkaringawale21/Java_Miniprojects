package org.omkaringawale.difour;

public class Address {

	private String district;
	private String state;
	private String country;
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void displayAddress(){
		System.out.println("********* Address ************");
		System.out.println(district + " : " + state + " : " + country);
		System.out.println("******************************");
	}
	
}
