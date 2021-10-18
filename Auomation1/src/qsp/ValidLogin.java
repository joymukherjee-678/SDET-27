package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	       }


 public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.actitime.com/");
	
	  
	  driver.findElement(By.name("username")).sendKeys("admin");  
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  
	  //System.out.println(i);
	     
	
	  
}
}
