package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateScenarios_about_Vtigers_com {

	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
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
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
	 
	 WebElement dublclick = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
	 
	 a.doubleClick(dublclick).perform();
	 
	 String text = driver.getTitle();
	 
	// String text = driver.findElement(By.xpath("//img[@class='img-fluid']")).;
	 
	 System.out.println(text);
	 
	 if(text.equals("HackerEarth Case Study | Vtiger CRM"))
	 {
		 
		 System.out.println("displayed");
		 
	 }

}
}
