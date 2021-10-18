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

public class AutomateScenario_of_CareerInsurancePolicy {

	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	 
	 //driver.findElement(By.xpath("//div[.='Login']")).click();
	  
	 
	 
	 driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
	 driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
	 driver.findElement(By.xpath("(//select)[1]")).click();
	 WebElement monthListBox = driver.findElement(By.xpath("(//select)[1]"));
	 
	 Select s;
	 
	 s = new Select(monthListBox);
	 s.selectByIndex(3);
	 
     WebElement yearListBox = driver.findElement(By.xpath("(//select)[2]"));
	 
	 s = new Select(yearListBox);
	 s.selectByIndex(6);
	 
	 driver.findElement(By.xpath("(//a[@href])[7]")).click();
	 
	 driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("6291629972");
	 
	 Thread.sleep(5000);
	
	 driver.findElement(By.xpath("//button[contains(text(),'Lets Renew')]")).click();
	 
	 
}
}