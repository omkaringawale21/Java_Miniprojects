package com.learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Omkar {

	@Test
	public void loginWithEmail(){
		System.out.println("Inside Test Login With Email");
	}
	
	@Test
	public void loginWithFacebook(){
		System.out.println("Inside Test Login With Facebook");
//		Assert.assertEquals("TestString", "TestString1");
	}
	
}
