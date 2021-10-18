package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopUp {

	static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     // System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	 
	 driver.get("https://www.flipkart.com/");
	  
	     // driver.findElement(By.xpath("(//button)[2]")).click();
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("(//button)[2]")).click();
	      
	     
	      
	  //    driver.close();
}

	}


