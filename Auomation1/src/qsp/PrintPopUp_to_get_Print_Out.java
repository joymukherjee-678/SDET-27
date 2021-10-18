package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class PrintPopUp_to_get_Print_Out {

static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	// WebDriver driver = new FirefoxDriver();
	   WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.google.com/");
	  
	  // driver.manage().window().maximize();
	 
	  Robot r = new Robot();
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_P);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  Thread.sleep(5000);
	  
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_UP);
	  r.keyPress(KeyEvent.VK_6);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  
}
}
