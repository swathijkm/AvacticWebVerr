package Testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.helper;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.DataProviderConfig;
import Factory.browserfactory;

public class VerifyHomePagewithvalidpwd {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest Log;
	
	@BeforeMethod
	
	public void startup()
	{
        report=new ExtentReports(".\\Reports\\LoginTestReport2.html");
		
		Log=report.startTest("Test1", "Just to test");
		
		Log.log(LogStatus.INFO, "Test2 started");
		
	}
	
	
	@Test
	public void justprint()
	{
	System.out.println("Hi i am other test2");
	
	Assert.assertEquals(3, 5);
	}
	
	
@AfterMethod
	
	public void closeDown(ITestResult result)
	{
		
			
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path=helper.CaptureScreenShot(driver, result.getName());
			
			Log.log(LogStatus.FAIL, Log.addScreenCapture(path));
			
		}
		
		
		report.endTest(Log);
		report.flush();
		
	}
}
	
	/*WebDriver driver;
	ExtentReports report;
	ExtentTest Log;
	
	@BeforeMethod
	
	public void Intiate() throws IOException
	{
		report=new ExtentReports(".\\Reports\\LoginTestReport.html");
		
		Log=report.startTest("Login verification test", "Sample description");
		
		 driver=browserfactory.GetBrowser("firefox");
		
		System.out.println(DataProviderConfig.getconfigfrompro().GetAPPURL());
				
		driver.get(DataProviderConfig.getconfigfrompro().GetAPPURL());
		
		Log.log(LogStatus.INFO, "URL is opened in firefox");
		
	}

	@Test
	public void TestHomePage() throws IOException
	{
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		String AppTitle=home.GetAppTitle();
		
		Log.log(LogStatus.INFO, "URL is opened and printed title");
		//Assert.assertEquals("swathu", "swawe");
		System.out.println(AppTitle);
		
		home.ClickOnSigninLink();
		 
		Log.log(LogStatus.PASS, "Home sign in test Passed");
		 
		
		LoginPage Login=PageFactory.initElements(driver, LoginPage.class);
		
		Log.log(LogStatus.INFO, "Getting title from excel");
		
		Login.LogininWebPage(DataProviderConfig.getconfigfromexcel().Getdata(0, 0, 0), DataProviderConfig.getconfigfromexcel().Getdata(0, 0, 1));
 
		Log.log(LogStatus.PASS, "Login test passed with valid id and pwd ");
			
	}
	
	@AfterMethod
	
	public void closeDown(ITestResult result)
	{
		
			
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path=helper.CaptureScreenShot(driver, result.getName());
			
			Log.log(LogStatus.FAIL, Log.addScreenCapture(path));
			
		}
		
		driver.close();
		report.endTest(Log);
		report.flush();
		
	}
}
*/
