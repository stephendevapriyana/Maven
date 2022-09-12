package com.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Eg {
	@Test
	public void googlee() {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Maven_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
	}
	@Test
	public void facebook() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\Maven_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
