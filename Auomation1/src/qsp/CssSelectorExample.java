package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Demo.html");
		
		//WebElement e = driver.findElement(By.linkText("Google"));
		
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[href='https://qspiders.com/']")).click();
		
    }

}