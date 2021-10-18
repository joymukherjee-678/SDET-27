package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste1 {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


    public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://demo.opensourcebilling.org/");
	  
	  driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
	  //driver.findElement(By.id("email")).sendKeys("a");
	  
	 // driver.findElement(By.id("email")).sendKeys("ac");
	  
	//  driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
	  
	  driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
	  //driver.findElement(By.id("email")).sendKeys("c");
	  
	  driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"a");
	// driver.findElement(By.id("password")).sendKeys("a");
	  
     // driver.findElement(By.id("password")).sendKeys("av");
	  
	 driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
	  //driver.findElement(By.id("password")).sendKeys("v");
	  
	 // driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
	  

}
}
