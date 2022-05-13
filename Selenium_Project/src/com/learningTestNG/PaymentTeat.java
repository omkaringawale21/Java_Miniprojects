package com.learningTestNG;

import org.testng.annotations.Test;

public class PaymentTeat {
	
	@Test
	public void PaymentInDollar(){
		System.out.println("Payment In Dollar");
	}
	
	@Test
	public void PaymentInRupee(){
		System.out.println("Payment In Rupee");
	}
	
}
