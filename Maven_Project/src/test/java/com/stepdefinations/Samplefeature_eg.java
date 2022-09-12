package com.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samplefeature_eg {
	
	
	WebDriver driver;
	@Given("^User is in Google Home Page$")
	public void user_is_in_Google_Home_Page() throws Throwable {
	   
	   
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Maven_Project\\Excel\\chromedriver.exe");
		
		driver=new ChromeDriver();
	  
		driver.get("https://www.google.com/");
		 throw new PendingException();
	}

	@When("^Type in Search bar For Stephen$")
	public void type_in_Search_bar_For_Stephen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    WebElement send = driver.findElement(By.name("q"));
		send.sendKeys("Stephen");
		 throw new PendingException();
	}

	@Then("^User click google Search$")
	public void user_click_google_Search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement cl = driver.findElement(By.name("btnK"));
		cl.click();
		 throw new PendingException();

	   
	}




}
