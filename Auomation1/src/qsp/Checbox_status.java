package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checbox_status {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


 public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.actitime.com/");
	  
	  boolean status = driver.findElement(By.xpath("//input[contains(@id,'LoggedInCheckBox')]")).isSelected();
	  
	  System.out.println("checbox status is "+status);
	  
	 /* if(status == true)
	  
		  System.out.println("checbox status is 'selected' ");
	  
	  else
		  
		  System.out.println("checbox status is 'un-selected' "); */

}
}
