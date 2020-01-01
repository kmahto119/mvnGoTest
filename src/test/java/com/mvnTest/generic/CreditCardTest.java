package com.mvnTest.generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class CreditCardTest {
	
	@Test
	public void test12() throws Exception{
		
	//start here
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:/Users/kailash/AppData/Local/Google/Chrome/Application/chrome.exe");
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver_78.exe");

		ChromeDriver driver = new ChromeDriver(chromeOptions);
		//driver.get("http://newtours.demoaut.com/");
		
	
	//end here	
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver_78.exe");
		//WebDriver driver = new ChromeDriver();
		
		
	// Initialize browser
	//WebDriver driver=new ChromeDriver();
	 
	// Open Google
	driver.get("http://www.google.com");
	 
	
//taking screenshot


	Date date=new Date();
	String currentDate=date.toString().replace(":", "_").replace(" ", "_");
	
	String failedTestName=getClass().toString();
	System.out.println("--------failed----"+failedTestName);
	EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
	File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
	File destFile=new File("./screenshot/"+failedTestName+"_"+currentDate+".png");
	try{
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("screenhot has captured");
	}
	catch (Exception e) {
		//
		System.out.println("screenhot not captured , am in catch blocks");
	}
		
	Thread.sleep(3000); 
	// Close browser
	driver.quit();
	}
	
	
	

}
