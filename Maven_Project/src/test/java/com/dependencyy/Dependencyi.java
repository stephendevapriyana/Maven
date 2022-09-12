package com.dependencyy;

import org.testng.annotations.Test;

public class Dependencyi {
	
	@Test
	public void isreal () {
		
		
		System.out.println("isreal army is Universel level very powerful becasu Tis Elohim Army");
	}
	@Test(dependsOnMethods="isreal")
	public void usa() {
		
		System.out.println("usa army is russia level");
	}
	@Test(dependsOnMethods="russia")
	public void india () {
		
		System.out.println("ind army is pak level");
	}
	
	
	

}
