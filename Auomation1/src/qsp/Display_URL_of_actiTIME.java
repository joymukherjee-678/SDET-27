package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_URL_of_actiTIME {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.actitime.com/");
	  
	  String url = driver.findElement(By.xpath("//a[@href = 'http://www.actitime.com']")).getAttribute("href");
	  
	  System.out.println("URL of actiTIME : "+url);

}
}
