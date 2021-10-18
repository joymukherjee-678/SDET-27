package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingPropertyFile_for_login_to_ActiTime_site {

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
		
		String url = p.getProperty("url");
		
		String username = p.getProperty("username");
		
		String password = p.getProperty("password");
		
        WebDriver driver = new OperaDriver();
		
		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
}
	
}
