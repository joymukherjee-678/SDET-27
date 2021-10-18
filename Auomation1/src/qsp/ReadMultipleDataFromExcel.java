package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class ReadMultipleDataFromExcel {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException{
		
		// get the java representative object of the physical file
		
		FileInputStream fis = new FileInputStream("./data/textscript1.xlsx");
		
		// create an workbook or open excel in read mode
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		
		// print all the data
		
		for(int i=0;i<=rowcount;i++)
		{
		
		// get the control of the sheet, then row, then cell then write the data
		
       String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
       
	   String pw =	wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	   
	   System.out.println(un+" "+pw);
	   
		}
		
}
	
}
