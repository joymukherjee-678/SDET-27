package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_the_Title_of_All_Tabs_After_click_on_acTIME_link {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://demo.actitime.com/login.do");
	 
	 driver.findElement(By.linkText("actiTIME Inc.")).click();
	 Thread.sleep(3000);
	 
	 Set<String> allTabs = driver.getWindowHandles();
	 
	 int count = allTabs.size();
	 
	 System.out.println(count);
	 
	 for(String tab:allTabs)
	 {
	
		 driver.switchTo().window(tab);
		 System.out.println(driver.getTitle());
          
		 //driver.close();
		 
	 }
	 
	 //driver.close();
	 
}
}