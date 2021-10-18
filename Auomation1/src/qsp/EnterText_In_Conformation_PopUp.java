package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterText_In_Conformation_PopUp {

	static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new OperaDriver();
	 
	 driver.get("https://www.Seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
	      driver.findElement(By.xpath("(//button[contains(text(),'Click')])[3]")).click();
	      
	      WebDriverWait wait = new WebDriverWait(driver,10);
	      
	      wait.until(ExpectedConditions.alertIsPresent());
	      
	      Alert a = driver.switchTo().alert();
	      
	      a.sendKeys("Joy");
	      
	       a.accept();
	       
	   WebElement e =  driver.findElement(By.xpath("//p[contains(text(),'You have entered')]"));
	     
	    String text =  e.getText();
	    
	  //  System.out.println(text);
	    
	    if(text.equals("You have entered 'Joy' !"))
	    {
	    	
	    	System.out.println("successfully entered the text");
	    	
	    }
	    
	    else
	    	
	    	System.out.println("not");
	     
	     //a.dismiss();
	       
	    // driver.
	     
	    // System.out.println(text);
	      
	  //    driver.close();
}

	}


