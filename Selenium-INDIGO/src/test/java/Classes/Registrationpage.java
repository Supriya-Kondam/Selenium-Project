package Classes;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;


public class Registrationpage extends BaseClass{
@Test
	
	public void registration() throws InterruptedException, FindFailed
	{
	test=extent.createTest("Registration page scenario");
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\Selenium browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Swapna");
	driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Raviram");
	driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("supriya.kondam@gmail.com");
	driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("8888888888");
	driver.findElement(By.xpath(" //body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
	System.out.println(driver.findElement(By.xpath(" //body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).isSelected());
	
	driver.findElement(By.cssSelector("input#checkbox2")).click();
	driver.findElement(By.cssSelector("input#checkbox3")).click();
	
	/*Select lang=new Select(driver.findElement(By.cssSelector("div.ui-autocomplete-multiselect ui-state-default ui-widget[@id=msdd]")));
	lang.selectByVisibleText("English"); */
	
	Select skills=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	skills.selectByVisibleText("APIs");
	System.out.println(skills.getOptions().size());//no.of items in dropdown
	
	Select contry=new Select(driver.findElement(By.id("countries")));
	contry.selectByVisibleText("India");
	
	Select year=new Select(driver.findElement(By.id("yearbox")));
	year.selectByValue("1981");
	
	Select month=new Select(driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
	month.selectByVisibleText("May");
	
	Select day=new Select(driver.findElement(By.id("daybox")));
	day.selectByVisibleText("14");
	
	driver.findElement(By.id("firstpassword")).sendKeys("Login@123");
	driver.findElement(By.id("secondpassword")).sendKeys("Login@123");
	
	
	driver.findElement(By.xpath("//input[@id='imagesrc']/parent::div")).click();
	Screen S=new Screen();
	Pattern fileinputtextbox=new Pattern("C:\\Users\\ADMIN\\Desktop\\Supriya\\Test Data\\sikulifileopen");
	Pattern fileopenbutton=new Pattern("C://Users//ADMIN//Desktop//Supriya//Test Data//sikulifilename.png");
	Thread.sleep(3000);
	S.wait(fileinputtextbox,10);
	String inputfile="C:\\Users\\ADMIN\\Desktop\\Supriya\\Test Data\\test.png";
	S.type(fileinputtextbox,inputfile);
	S.click(fileopenbutton);
	
	driver.findElement(By.id("submitbtn")).click();
	
	String act=driver.getTitle();
	String exp="Web Table";
	if(act.equals(exp))
	{
	System.out.println("Test pass");
	}
	else
	{
		System.out.println("Test fail");
		
	}
driver.close();
}

}




