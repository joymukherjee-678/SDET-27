package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingScrollBar {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("https://www.bbc.com/");
		
		RemoteWebDriver r = (RemoteWebDriver)driver;
		
	//	JavascriptExecutor j= (JavascriptExecutor)driver;
		
		r.executeScript("window.scrollBy(0,4000)");
		
	//	j.executeScript("window.scrollBy(0,4000)");
		
	
}
	
}
