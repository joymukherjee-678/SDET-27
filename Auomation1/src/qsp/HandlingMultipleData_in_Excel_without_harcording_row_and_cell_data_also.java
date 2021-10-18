package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingMultipleData_in_Excel_without_harcording_row_and_cell_data_also {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException{
		
		// get the java representative object of the physical file
		
		FileInputStream fis = new FileInputStream("./data/textscript1.xlsx");
		
		// create an workbook or open excel in read mode
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//for(int i=1;i<=rowC)
		
		int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
		int cellCount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		
	for(int i=0;i<=rowCount;i++)
	{
	for(int j=0;j<cellCount;j++)
	{
	  String text = wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
	  System.out.print(text +" ");
	  
	}
	System.out.println(   );
	 
}
}
	}