package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

//package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 

/**
 *Generic class for data driven testing
 *@author BTM USER
 *
*/

class WebDriverCommonLib {
/**
 *generic method for implicit wait
 *@param driver

*/
	public void waitForElementToLoad(WebDriver driver){
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
} 

/**
 *generic method for explicit wait
 *@param driver
 *@param element

*/
public void waitForElementPresent(WebDriver driver,WebElement element){
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	wait.until(ExpectedConditions.visibilityOf(element));
	
} 

/**
 *generic method for explicit wait
 *@param driver
 *@param element

*/
public void customWaitForElementPresent(WebElement element){
	
	int i=0;
	
	while(i<=100)
	{
		
		try {
			
			element.isDisplayed();
			
		}
		
		catch (Exception e) {
			
			i++;
			
		}
		
	}
	
} 

/**
 *generic method for selecting the value using index 
 *@param driver
 *@param element

*/
public void selectElement(WebElement element,int i){
	
	Select s = new Select(element);
	
	s.selectByIndex(i);
	
} 
 
/**
 *generic method for selecting the value using index 
 *@param driver
 *@param element

*/
public void selectElement(WebElement element,String text){
	
	Select s = new Select(element);
	
	s.selectByVisibleText(text);;
	
} 

}

public class DemoWebDriverCommonLib
{
	
static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}

	public static void main(String[] args) throws IOException{
		
		WebDriver driver = new OperaDriver();
		
		WebDriverCommonLib w = new WebDriverCommonLib();
		
		FileLib f = new FileLib();
		
		w.waitForElementToLoad(driver);
		
	//	w.waitForElementPresent(driver, 10);
		
		String url = f.getPropertyData("url");
		
		String un = f.getPropertyData("username");
		
		String pws = f.getPropertyData("password");
		
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(un);
		
		driver.findElement(By.name("pwd")).sendKeys(pws);
		 
	}
	
} 

