package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ActionsMouseOver extends BaseClass {
	
			
	@Test
	public void Mouseover()
	{
		test=extent.createTest("Mouse over scenario");		
			
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	test.pass("HDFC browser launched");
	driver.get("https://www.hdfcbank.com");
	
	Actions act=new Actions(driver);
	
	WebElement pay=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[13]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"));
	WebElement dbtcard=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[13]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	
	act.moveToElement(pay).moveToElement(dbtcard).click().build().perform();
	test.pass("cursor moment done");
	System.out.println("test");
	driver.close();
	}



}
