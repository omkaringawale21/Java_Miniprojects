package com.learningTestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class AdvDataProviders {

	Object[][] obj = null;
	
	@DataProvider(name="data")
	public Object[][] testData(Method m){
		
		if(m.getName().equals("registerUser")){
			obj = new Object[3][4];
			
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
		}
		
		if(m.getName().equals("LoginUser")){
			obj = new Object[3][2];
			
			obj[0][0] = "rahuldabholkarv@gmail.com";
			obj[0][1] = "rahul";
			
			obj[1][0] = "tejasdabholkarv@gmail.com";
			obj[1][1] = "tejas";
			
			obj[2][0] = "omkaringawale21@gmail.com";
			obj[2][1] = "omkar";
		}
		
		return obj;
	}
	
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
	
	@DataProvider(name="logindata")
	public Object[][] loginTestData(){
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "rahuldabholkarv@gmail.com";
		obj[0][1] = "rahul";
		
		obj[1][0] = "tejasdabholkarv@gmail.com";
		obj[1][1] = "tejas";
		
		obj[2][0] = "omkaringawale21@gmail.com";
		obj[2][1] = "omkar";
		
		return obj;
	}
	*/
}
