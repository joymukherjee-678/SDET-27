package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingExcel {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException{
		
		// get the java representative object of the physical file
		
		FileInputStream fis = new FileInputStream("./data/textscript.xlsx");
	     	
		// create an workbook or open excel in read mode
		 
		Workbook wb = WorkbookFactory.create(fis);
		
		// get the control of the sheet, then row, then cell then read the data
		
       String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
       
       // print the data on the console 
       
       System.out.println(data);
		
}
	
}
