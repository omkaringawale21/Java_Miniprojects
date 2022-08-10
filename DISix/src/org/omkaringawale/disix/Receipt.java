package org.omkaringawale.disix;

public class Receipt {

	private String rno;
	private String rdate;
	private int ramt;
	
	public int getRamt() {
		return ramt;
	}

	public Receipt(String rno, String rdate, int ramt) {
		this.rno = rno;
		this.rdate = rdate;
		this.ramt = ramt;
	}
	
	void displayReceipt(){
		
		System.out.println(rno + " : " + rdate + " : " + ramt);
		
	}
	
}
