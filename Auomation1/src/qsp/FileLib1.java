package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

class FileLib1 {
		
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
	
}




