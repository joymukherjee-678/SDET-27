package qsp;

import java.awt.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automate_Scenario_of_Read_Service_Agreement_Link {

	static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://demo.actitime.com/login.do");
	  
	     // driver.findElement(By.xpath("(//button)[2]")).click();
	      
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	      
	      driver.findElement(By.xpath("(//div)[13]")).click();
	      
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
	      
	     // driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
	      driver.findElement(By.linkText("About your actiTIME")).click();
	      
	      Thread.sleep(2000);
	      
	      
	      driver.findElement(By.linkText("Read Service Agreement")).click();
	      
	      Set<String> allwindow = driver.getWindowHandles();
	      
	      for(String window:allwindow)
	      {
	    	  
	    	  driver.switchTo().window(window);
	    	  String title = driver.getTitle();
	    	  
	    	  if(title.equals("actiTIME Time Tracking Software License Agreement")) {
	    		  
	    		 java.util.List<WebElement> list = driver.findElements(By.xpath("//h2"));
	    		  
	    		  for(WebElement l:list)
	    		  {
	    			  
	    			  String text = l.getText();
	    			  System.out.println(text);
	    		  }
	    		  
	    		  
	    	  }
	    	  
	      } 
	      
	      java.util.List<WebElement> list = driver.findElements(By.xpath("//h2"));
	      
	      for(WebElement l:list)
		  {
			  
			  String text = l.getText();
			  System.out.println(text);
		  }
	      
	      
	  //    driver.close();
}

	}




