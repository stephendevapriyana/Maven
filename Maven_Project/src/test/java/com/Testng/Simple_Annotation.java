package com.Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	
	@Test
	@BeforeMethod
	public void stephen() {
		
		System.out.println("Stephen Devapriyan Is Mossad agent ");
	}
	@Test
	@BeforeSuite
	public void pual() {
		
		System.out.println("paul is CIA agent");
	}
	@Test
	@BeforeClass
	public void veera_suriya() {
		
		System.out.println("suriya is my old name");
	}
	@Test
	@BeforeTest
	public void mani() {
		
		System.out.println("mani is Raw agent");
	}
	
	
	
}
