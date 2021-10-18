package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement monthListBox = driver.findElement(By.id("month"));
		
		Select s = new Select(monthListBox);
		
		//s.selectByIndex(12);
		s.selectByValue("7");
		//s.selectByVisibleText("Jul");
		
		

}
}
