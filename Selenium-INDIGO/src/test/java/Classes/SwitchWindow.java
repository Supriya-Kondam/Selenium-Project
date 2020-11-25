package Classes;


import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class SwitchWindow extends BaseClass{


	
	@Test
	
	public void Switchbtw() throws InterruptedException, FindFailed 	{
		
		test=extent.createTest("Swithing2 between windows");
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://github.com/");
	test.pass("github launched");
	driver.get("https://www.orangehrm.com/services/");
	test.pass("orange hrm launched");
    Set <String> S =driver.getWindowHandles();
    
    for(String i:S)
    {
	String title=driver.switchTo().window(i).getTitle();
	test.info("switch baack to window");
	if(title.contains("GitHub"))
			{
		driver.close();
		test.pass("window got closed");
			}
        else
        {
        	
        	driver.navigate().back();
        }
	
	driver.close();
    }
	
	}
	@Test
	public void Mouseover()
	{
	test=extent.createTest("MouseOver2 Scenario");
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.hdfcbank.com");
	test.pass("hdfc browser launched");
	
	Actions act=new Actions(driver);
	

	WebElement pay=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[13]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"));
	WebElement dbtcard=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[13]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	
	
	act.moveToElement(pay).moveToElement(dbtcard).click().build().perform();
	driver.close();
		
	}
	
	

	
}
