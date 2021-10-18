package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownload_of_latest_stableVersion {

	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	 
	 driver.get("https://www.selenium.dev/downloads/");
	  
	      driver.findElement(By.xpath("//p[.='Java']/../p[2]/a")).click();
	      
	        Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_ALT);
			
			Thread.sleep(5000);
			
			r.keyPress(KeyEvent.VK_ENTER); 
			r.keyRelease(KeyEvent.VK_ENTER);
			
	 
	   
	     
	      
	      
	  //    driver.close();
}

	}


