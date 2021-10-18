package qsp;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class PerformDragAndDrop {


	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	//  WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	//s  WebDriver driver = new ChromeDriver();
	  
	//  driver.get("https://www.google.com/");
	  //driver.get("https://www.vtiger.com/");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	 
	 WebElement source = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
	 
	 WebElement target = driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]")); 
	 
	 Actions a = new Actions(driver);
	 
	 a.dragAndDrop(source, target).perform();

}
}
