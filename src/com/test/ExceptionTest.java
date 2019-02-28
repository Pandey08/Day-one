package com.test;

import org.testng.annotations.Test;

public class ExceptionTest {

	
	
	
	
	@Test(expectedExceptions=NumberFormatException.class )
	public void test()
	{
		String s="100A";
		int i=Integer.parseInt(s);
				
	}
}
