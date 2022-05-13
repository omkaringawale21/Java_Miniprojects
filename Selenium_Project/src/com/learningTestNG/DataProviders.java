package com.learningTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

//	@Test(dataProvider="testData")
//	@Test(dataProvider="data")
	@Test(dataProviderClass=AdvDataProviders.class, dataProvider="data", priority=1)
	public void registerUser(String FristName,
			                 String LastName,
			                 String Email,
			                 String PassWorld){
		System.out.println(FristName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(PassWorld);
	}
	
	@Test(dataProviderClass=AdvDataProviders.class, dataProvider="data", priority=2)
	public void LoginUser(String Email,
			                 String PassWorld){
		System.out.println(Email);
		System.out.println(PassWorld);
	}
	
/*	@Test(dataProviderClass=AdvDataProviders.class, dataProvider="logindata", priority=2)
	public void LoginUser(String Email,
			                 String PassWorld){
		System.out.println(Email);
		System.out.println(PassWorld);
	}*/
	
/*	@DataProvider(name="data")
	public Object[][] testData(){
		Object[][] obj = new Object[3][4];
		
		obj[0][0] = "Rahul";
		obj[0][1] = "Dabholkar";
		obj[0][2] = "rahuldabholkarv@gmail.com";
		obj[0][3] = "rahul";
		
		obj[1][0] = "Tejas";
		obj[1][1] = "Dabholkar";
		obj[1][2] = "tejasdabholkarv@gmail.com";
		obj[1][3] = "tejas";
		
		obj[2][0] = "Omkar";
		obj[2][1] = "Ingawale";
		obj[2][2] = "omkaringawale21@gmail.com";
		obj[2][3] = "omkar";
		
		return obj;
	}
	*/
}
