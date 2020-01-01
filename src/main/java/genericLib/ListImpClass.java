package genericLib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		Date date=new Date();
		String currentDate=date.toString().replace(":", "_").replace(" ", "_");
		
		String failedTestName=result.getMethod().getMethodName();
		System.out.println("--------failed----"+failedTestName);
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshot/"+failedTestName+"_"+currentDate+".png");
		try{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch (Exception e) {
			//
			System.out.println("screenhot not captured , am in catch blocks");
		}
			
		
	}

	@Override
	public void onStart(ITestContext context) {
		//
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//
		
	}
	
}

