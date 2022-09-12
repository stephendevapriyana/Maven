package com.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providerr {
	
	
	@Test(dataProvider="stephen")
	private void add(String name,int num) {
		
		System.out.println(name);
		System.out.println(num);	
		
	}
	@DataProvider
	private Object[][] stephen() {
		
		return new Object[][] {
			
			{"deva",24},{"stephen",25},{"danny",27}
		};
		
	}

}
