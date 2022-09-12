package com.expectedexception;

import org.testng.annotations.Test;

public class Expected_Exceptione {
	
	
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	//@Test(expectedExceptions=NaulpointException.class)
	//if we not give expected exception throw error
	private void sum() {
		
		int a=10;
		System.out.println(a/0);
	}

}
