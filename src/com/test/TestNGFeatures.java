package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	
	@Test
	public void login()
	{
		System.out.println("login test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest()
	{
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="login")
	public void searchPageTest()
	{
		System.out.println("login test");
	}
	
	
	
	
	
	
	
	
	
	
}
