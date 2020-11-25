package Classes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
		WebDriver driver;
		
		
		@BeforeClass
		
		public void setextent() 		{
			

		htmlReporter=new ExtentHtmlReporter("ExtentReport1");
		  		extent=new ExtentReports();
		  		extent.attachReporter(htmlReporter);
		
		}
		
	
	
		@AfterMethod(alwaysRun = true)
		
		public void getResult(ITestResult result) throws IOException {
			if
			(result.getStatus()==ITestResult.FAILURE)
			{
				
		String Screenshotpath=Screenshot.capture(driver,"extentreportscreenshot");
			
			test.log(Status.FAIL,"Screenshot below"+test.addScreenCaptureFromPath(Screenshotpath));
			
			}
			
		}
		
		@AfterClass(alwaysRun = true)
		public void teardown()	{
			driver.close();
			extent.flush();
		}
		
}
