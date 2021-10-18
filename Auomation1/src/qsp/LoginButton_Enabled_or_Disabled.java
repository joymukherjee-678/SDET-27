package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton_Enabled_or_Disabled {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


 public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.actitime.com/");
	  
	  boolean button = driver.findElement(By.xpath("//div[text() = 'Login ']")).isEnabled();
	  
	  if(button == true)
		  
		  System.out.println("Login button is Enabled");
	  
	  else
		  
		  System.out.println("Login button is Disabled");
      
}
}
