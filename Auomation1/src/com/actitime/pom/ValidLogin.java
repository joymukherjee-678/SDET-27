package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin {

static {
		
	       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
}

 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.actitime.com/");
	 
	 LoginPage l = new LoginPage();
	 
	// LoginPage1 l = new LoginPage1(driver);
	 
	 PageFactory.initElements(driver, l);
	 
	 l.setLogin("admin","manager");
	 
}
	
}
