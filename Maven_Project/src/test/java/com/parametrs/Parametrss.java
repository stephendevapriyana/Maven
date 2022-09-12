package com.parametrs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrss {
	
	
	@Test
	@Parameters("suriya")
	private void stephen(String name) {
		
		System.out.println("my name is"+name);
	}
	
	

}
