package com.learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priorities_DependsOnMethod {
	// Priorities
/*	@Test(priority=1)
	public void login(){
		System.out.println("Log in");
	}
	
	@Test(priority=2)
	public void navigating(){
		System.out.println("Navigating");
	}
	
	@Test(priority=3)
	public void logout(){
		System.out.println("Log out");
	}*/
	
	// Depends On Method
	@Test()
	public void login(){
		System.out.println("Log in");
		Assert.assertEquals("String1", "String2");
	}
	
//	@Test(dependsOnMethods={"login"})
	@Test()
	public void navigating(){
		System.out.println("Navigating");
	}
	
	@Test(priority=1, dependsOnMethods={"login", "navigating"})
	public void logout(){
		System.out.println("Log out");
	}

}
