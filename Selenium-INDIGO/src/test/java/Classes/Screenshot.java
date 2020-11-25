package Classes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static String capture(WebDriver driver, String Screenshotname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver; //down casting
		File source=ts.getScreenshotAs(OutputType.FILE); //capturing screen shot as output file
		String dest="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium-INDIGO\\ErrorScreenshot\\"+Screenshotname+".png";//path and extention of the file
		File destination=new File(dest); //copying file from temp location to desired location
		FileUtils.copyFile(source, destination);
		return dest;
		
		
	}

}
