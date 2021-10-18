package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HandlingFrames {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Page1.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("qsp");

}
}
