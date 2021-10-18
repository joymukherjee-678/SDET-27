package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Login_to_Facebook {
    
	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


    public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("joymukherjee932@gmail.com");
	  
	  driver.findElement(By.id("pass")).sendKeys("xyz");
	  
	  driver.findElement(By.cssSelector("button[name='login']")).click();
	  
	  // driver.findElement(By.cssSelector("span[dir='auto']")).click();

    }
    
}
