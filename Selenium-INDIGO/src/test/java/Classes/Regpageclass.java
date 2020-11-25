package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import pageObjects.Registrationpage;


public class Regpageclass {

	@Test
	
	public void registration()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	Registrationpage rgp=new Registrationpage(driver);
	
	rgp.SetFirstname("Swarupa");
	rgp.Setlasttname("Chintala");
	rgp.setaddress("gamutsabode,flat#111");
	rgp.setemail("swarupa.chintala@gmail.com");
	rgp.setphone();
	rgp.setgender();
	/*rgp.setcheckbox();
	rgp.setlanguage(); */	
	rgp.setskills();	
	rgp.setcontry();
	rgp.setscontry();
	rgp.setyear();
	rgp.setmoth();
	rgp.setday();
	rgp.setpassword("login@123");
	rgp.setcpassword("login@123");
	
			
		
	}
	
}
