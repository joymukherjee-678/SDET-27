package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_using_Custom_wait {


	static {
		
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	     
	       }


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new OperaDriver();
	  
	  driver.get("https://demo.actitime.com/");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	 // driver.findElement(By.xpath("//div[.='Login ']")).click();;
	  
	  int i =0;
	  
	  while(i<=100)
	  {
		  
		  try {
			  
			   driver.findElement(By.id("logoutLink")).click();
			   
			   break;
			  
		  }
		  
		  catch(NoSuchElementException n)
		  {
			  
			  System.out.println("no element");
			  i++;
			  
		  }
		  
	  }
	  
	  

}
}