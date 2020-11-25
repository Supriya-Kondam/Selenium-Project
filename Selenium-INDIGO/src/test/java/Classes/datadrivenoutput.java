package Classes ;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class datadrivenoutput extends BaseClass{
	
	@Test
	public void ReadData() throws IOException  {
		test=extent.createTest("read data from excel");
		
	FileInputStream file= 	new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Supriya\\Test Data\\test.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int rowcount=sheet.getLastRowNum();
	int colcount=sheet.getRow(0).getLastCellNum();
	System.out.println(rowcount);
	System.out.println(colcount);
	
	for(int i=1;i<rowcount;i++)
	{
		XSSFRow currentrow=sheet.getRow(i);
		
		for(int j=0;j<colcount;j++) {
		double value=currentrow.getCell(j).getNumericCellValue();
				System.out.println("  "+value);
		}
	}
	
}
}