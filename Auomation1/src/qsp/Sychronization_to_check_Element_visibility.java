package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sychronization_to_check_Element_visibility {


	static {
		
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	     
	       }


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new OperaDriver();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	  
	  driver.get("https://demo.actitime.com/");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	  driver.findElement(By.xpath("//div[.='Login ']")).click();;
	  
	
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	  
	  driver.findElement(By.id("logoutLink")).click();
	  
	  
	  
	  

}
}