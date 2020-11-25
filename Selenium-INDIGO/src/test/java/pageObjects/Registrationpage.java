package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement firstname;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
	WebElement lastname;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")
	WebElement address;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")
	WebElement email;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]")
	WebElement genderF;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	WebElement checkbox;
	
	@FindBy(id="msdd")
	WebElement language;
	
	@FindBy(xpath="Skills")
	WebElement skil;
	
	@FindBy(id="countries")
	WebElement country;
	
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")
	WebElement scountry;
	
	@FindBy(id="yearbox")
	WebElement year;
	
	@FindBy(id="Month")
	WebElement month;
	
	@FindBy(id="daybox")
	WebElement day;
	
	@FindBy(id="firstpassword")
	WebElement password;
	
	@FindBy(id="secondpassword")
	WebElement cpassword;
	
	@FindBy(id="submitbtn")
	WebElement submit;
	
	public Registrationpage(WebDriver d)
	{
		driver=d;
			PageFactory.initElements(d,this);
			
	}

	
	public void SetFirstname(String fn)
	{
		firstname.sendKeys(fn);
		
	}
	public void Setlasttname(String ln)
	{
		lastname.sendKeys(ln);
		
	}
	public void setaddress(String ad)
	{
		address.sendKeys(ad);
		
	}
	public void setphone()
	{
		phone.sendKeys("9876543210");
		
	}
	public void setemail(String em)
	{
		email.sendKeys(em);
		
	}
	public void setgender()
	{
		genderF.click();
		Select g=new Select(genderF);	
	    g.selectByVisibleText("FeMale");
		
	}
	/*public void setcheckbox()
	{
		checkbox.click();
	}
		
	public void setlanguage()
	{
		
		Select lg=new Select(language);
		lg.selectByValue("English");
		
	}*/
	
	public void setskills()
	{
		skil.click();
		
		Select l=new Select(skil);
        l.selectByVisibleText("APIs");
	}
	public void setcontry()
	{
		
		Select c=new Select(country);
		c.deselectByVisibleText("India");
		
	}
	public void setscontry()
	{
		
		Select sc=new Select(scountry);
		sc.deselectByVisibleText("Australia");
		
	}
	public void setyear()
	{
		
		Select y=new Select(year);
		y.deselectByVisibleText("1981");
		
	}
	public void setmoth()
	{
		
		Select m=new Select(month);
		m.deselectByVisibleText("June");
		
	}
	public void setday()
	{
		
		Select d=new Select(day);
		d.deselectByVisibleText("14");
		
	}
	public void setpassword(String p)
	{
		
		password.sendKeys(p);
	
		
	}
	public void setcpassword(String cp)
	{
		
		password.sendKeys(cp);
		
	}
	public void setsubmit()
	{
		
		submit.click();
		
	}
}
	

