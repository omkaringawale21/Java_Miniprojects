package com.learningTestNG;

import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	@Test(groups={"performance"})
	public void feature1(){
		System.out.println("Inside Feature 1");
	}
	
	@Test(groups={"regression"})
	public void feature2(){
		System.out.println("Inside Feature 2");
	}
	
	@Test(groups={"performance", "regression"})
	public void feature3(){
		System.out.println("Inside Feature 3");
	}
	
}
