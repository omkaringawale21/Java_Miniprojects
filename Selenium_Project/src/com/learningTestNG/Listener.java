package com.learningTestNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{

	public void onTestSuccess(ITestResult tr){
		System.out.println("Test Case Passed");
	}
	
	public void onTestFailture(ITestResult tr){
		System.out.println("Test Case Failed");
	}
	
}
