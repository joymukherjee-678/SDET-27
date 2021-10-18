package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingFrames_by_Typing_Character_by_Character {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Page1.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("j");
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("q");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("s");
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("s");
		
		Thread.sleep(5000);
		
		WebElement chFrame = driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(chFrame);
		driver.findElement(By.id("t2")).sendKeys("p");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("p");
		
		driver.close();
		

}
	
}
