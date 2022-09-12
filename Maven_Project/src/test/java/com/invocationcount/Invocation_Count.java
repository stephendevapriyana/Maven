package com.invocationcount;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invocation_Count {


	@Test(invocationCount=7)
	
	public void stephen() {
		
		System.out.println("Stephen Devapriyan Is Mossad agent ");
	}
	@Test
	
	public void pual() {
		
		System.out.println("paul is CIA agent");
	}
	@Test
	
	public void veera_suriya() {
		
		System.out.println("suriya is my old name");
	}
	@Test
	
	public void mani() {
		
		System.out.println("mani is Raw agent");
	}
	
	
}
