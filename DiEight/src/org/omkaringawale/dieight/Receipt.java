package org.omkaringawale.dieight;

public class Receipt {

	private int rno;
	private String rdate;
	private int ramt;
	
	public Receipt(int rno, String rdate, int ramt) {
		this.rno = rno;
		this.rdate = rdate;
		this.ramt = ramt;
	}
	
	public void displayReceipt(){
		System.out.println(rno + " : " + rdate + " : " + ramt);
	}

	public int getRamt() {
		return ramt;
	}
	
}