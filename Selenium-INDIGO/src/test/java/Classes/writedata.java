package Classes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class writedata extends BaseClass{
	
	@Test
	public void writedataintoexcel() throws IOException  {
		test=extent.createTest("Write data into excel");
	FileOutputStream file=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Supriya\\Test Data\\testinput.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet= workbook.createSheet("SheetNew");
	
	for(int i=0;i<5;i++)  {
	
	XSSFRow row=sheet.createRow(i);
	for(int j=1;j<3;j++)  {
	row.createCell(j).setCellValue("Swap");
	
	
	}
	}
	workbook.write(file);
	}
	
	
}
