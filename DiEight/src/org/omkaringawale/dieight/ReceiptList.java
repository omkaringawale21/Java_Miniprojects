package org.omkaringawale.dieight;

import java.util.List;

public class ReceiptList {

	private List<Receipt> receipts;

	public ReceiptList(List<Receipt> receipts) {
		this.receipts = receipts;
	}
	
	int total = 0;
	
	public void displayReceiptList(){
		
		System.out.println("****** Receipts ******");
		for(Receipt rec : receipts){
			total = total + rec.getRamt();
			rec.displayReceipt();
		}
		System.out.println("**********************");
		System.out.println("Total Amount Paid : " + total);
		System.out.println("");
		
	}
	
}
