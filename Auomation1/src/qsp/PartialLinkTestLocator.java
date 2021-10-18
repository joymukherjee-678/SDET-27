package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTestLocator {

    static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Demo.html");
		
		//WebElement e = driver.findElement(By.linkText("Google"));
		
		driver.findElement(By.partialLinkText("2")).click();

    }
	
}
