package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConformationPopUp {

	static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	 
	 driver.get("https://www.Seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
	      driver.findElement(By.xpath("(//button[.='Click me!'])[2]")).click();
	      
	      WebDriverWait wait = new WebDriverWait(driver,10);
	      
	      wait.until(ExpectedConditions.alertIsPresent());
	      
	      Alert a = driver.switchTo().alert();
	      
	   //   a.accept();
	     
	     String text =  a.getText();
	     
	     a.dismiss();
	     
	     System.out.println(text);
	      
	      driver.close();
}

	}


