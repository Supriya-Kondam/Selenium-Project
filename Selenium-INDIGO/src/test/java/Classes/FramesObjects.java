package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class FramesObjects extends BaseClass{
	@Test

	public void Frames()
	{
		test=extent.createTest("Switch between frames");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");	
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Welcome");
		
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]")));
		driver.switchTo().frame(driver.findElement(By.xpath(" //body/section[1]/div[1]/div[1]")));
		test.log(Status.FAIL, "there is issue in identification of frames");
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Inside field");
		test.pass("switch to frames successfully");
		
		
		driver.close();
		
		
	}
}
