package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingRightClick {

	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	//  WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	//s  WebDriver driver = new ChromeDriver();
	  
	//  driver.get("https://www.google.com/");
	  //driver.get("https://www.vtiger.com/");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com/login.do");
	 
	 WebElement alink = driver.findElement(By.partialLinkText("actiTIME"));
	 
	 Actions a = new Actions(driver);
	 
	 a.contextClick(alink).perform();
	 
	 Robot r = new Robot();
	 
	 r.keyPress(KeyEvent.VK_W);
	 
	 driver.close();

}
}
