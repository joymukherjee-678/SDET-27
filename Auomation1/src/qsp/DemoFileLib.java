package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *Generic class for data driven testing
 *@author BTM USER
 *
*/

class FileLib {
/**
 *generic method to read the data from Property file
 *@param key
 *@return String
 *@throws IOException
*/
	
public String getPropertyData(String key) throws IOException{
	
	FileInputStream fis = new FileInputStream("./data/Commondata.property");
	
	Properties p = new Properties();
	
	p.load(fis);
	
	String data = p.getProperty(key);
	
	return data;
	
}

/**
 *generic method to read the data from excel file
 *@param sheetname
 *@param row
 *@param cell
 *@param String
 *@param EncryptedDocumentException
 *@throws IOException
*/

public String getExcelData(String sheetname,int row,int cell) throws IOException{
	
	// get the java representative object of the physical file
	
	FileInputStream fis = new FileInputStream("./data/textscript.xlsx");
	
	// create an workbook or open excel in read mode
	
	Workbook wb = WorkbookFactory.create(fis);
	
	// get the control of the sheet, then row, then cell then write the data
	
    String data = wb.getSheet("CreateCustomer").getRow(row).getCell(cell).getStringCellValue();
	       
	
	return data;
	
}

/**
 *generic method to write the data from excel file
 *@param sheetname
 *@param row
 *@param cell
 *@param String
 *@param EncryptedDocumentException
 *@throws IOException
*/

public void setExcelData(String sheetname,int row,int cell,String data) throws IOException{
	
	// get the java representative object of the physical file
	
	FileInputStream fis = new FileInputStream("./data/textscript.xlsx");
	
	// create an workbook or open excel in read mode
	
	Workbook wb = WorkbookFactory.create(fis);
	
	// get the control of the sheet, then row, then cell then write the data
	
    wb.getSheet("CreateCustomer").getRow(row).getCell(cell).setCellValue(data);
    
    FileOutputStream fos = new FileOutputStream("./data/textscript.xlsx");
    
    wb.close();
	       
	
}
	
}

class DemoFileLib
{
	
	public static void main() throws IOException {
		
		FileLib f = new FileLib();
		
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		
		String customerName = f.getExcelData("CreateCustomer", 1, 2);
		
		System.out.println(customerName);
		
		f.setExcelData("CreateCustomer", 1, 4,"pass");
		
	}
	
}
