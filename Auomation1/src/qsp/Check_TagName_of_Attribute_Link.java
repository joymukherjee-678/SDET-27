package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_TagName_of_Attribute_Link {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.actitime.com/");
	  
	  String tagName = driver.findElement(By.xpath("//a[@href = 'http://www.actitime.com']")).getTagName();
	  
	  if(tagName.equals("a"))
	  {
		  
		  System.out.println("the Tag name of attribute Link : "+tagName);
		  
	  }

}
}
