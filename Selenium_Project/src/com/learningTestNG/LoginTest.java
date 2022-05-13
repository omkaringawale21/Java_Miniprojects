package com.learningTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void LoginviaEmail(){
		System.out.println("Login Via Email");
		try{
			Assert.assertEquals("Vaibhav", "Vaibhav1");
		}catch(Throwable t){
			System.out.println(t);
		}
		System.out.println("After Assert Condition");
//		Assert.assertEquals(1, 2);
//		Assert.assertTrue(4>1);
//		Assert.assertFalse(1>4);
	}
	
	@Test
	public void LoginviaFacebook(){
		System.out.println("Login Via Facebook");
//		throw new SkipException("Facebook Functionality is not supported");
	}
	
	@Test
	public void LoginviaTwitter(){
		System.out.println("Login Via Twitter");
//		throw new SkipException("Twitter Functionality is not supported");
	}

}
