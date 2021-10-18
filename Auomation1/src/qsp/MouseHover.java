package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class MouseHover {

static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	
	//  WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	//s  WebDriver driver = new ChromeDriver();
	  
	//  driver.get("https://www.google.com/");
	  driver.get("https://www.vtiger.com/");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.vtiger.com/");
	 
	 WebElement resourcesTab = driver.findElement(By.partialLinkText("Resources"));
	 
	 Actions a = new Actions(driver);
	 
	 a.moveToElement(resourcesTab).perform();
	 
	 driver.findElement(By.partialLinkText("Contact Us")).click();
	 
	 String phno =driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
	 
	 System.out.println(phno);
	 
	 driver.close();

}
}
