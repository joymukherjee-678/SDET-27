package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_for_waiting_for_complete_title_in_Home_page_of_ActiTIME {

	static {
		
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	     
	       }


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new OperaDriver();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  driver.get("https://demo.actitime.com/");
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  
	  wait.until(ExpectedConditions.titleContains("Enter"));
	  
	  String title = driver.getTitle();
	  
	  System.out.println(title);

}
}
