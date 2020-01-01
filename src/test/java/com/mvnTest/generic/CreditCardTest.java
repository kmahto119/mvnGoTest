package com.mvnTest.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreditCardTest {
	
	@Test
	public void test12() throws Exception{
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open Google
	driver.get("http://www.google.com");
	 
	// Close browser
	driver.quit();
	}
	
	
	

}
