package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Demo.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/a[2]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/a")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/a")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div/a[1]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div/a[2]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div/a")).click();
		
		
		
		
}

}