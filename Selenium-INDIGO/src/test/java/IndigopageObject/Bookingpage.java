package IndigopageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Bookingpage {
	
	WebDriver driver;
	
By from=By.xpath("//body/div[@id='body']/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");

By To=By.xpath("//body/div[@id='body']/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");

By deptdeparture=By.xpath("//body/div[@id='body']/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]");

By arrival=By.xpath("//body/div[@id='body']/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/input[1]");

	
   public Bookingpage(WebDriver d)
{
	   driver=d;
	   //This.driver=driver;
}
   
   public void setfrom(String frm)
   {
	   driver.findElement(from).sendKeys(frm);
   }
   
   
   public void setTo(String to)
   {
	   driver.findElement(To).sendKeys(to);
   }
      
   public void setdeparture(String dept)
   {
	   driver.findElement(deptdeparture).sendKeys(dept);
   }
   
   public void setarrival(String arv)
   {
	   driver.findElement(arrival).sendKeys(arv);
   }
}