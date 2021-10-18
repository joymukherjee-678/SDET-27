package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingPropertyFile {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException, IOException{
		
		// get the java representative object of the pysical file
		
		FileInputStream fis = new FileInputStream("./data/Commondata.property");
		
		// create an object of property file
		
		Properties p = new Properties();
		
		//load the file
		
		p.load(fis);
		
	//	get the data by passing the key
		
		String data = p.getProperty("username");
		
		// print the data on console
		
		System.out.println(data);
		
		System.out.println(p.getProperty("url"));
		
		System.out.println(p.getProperty("password"));
		
}
	
}
