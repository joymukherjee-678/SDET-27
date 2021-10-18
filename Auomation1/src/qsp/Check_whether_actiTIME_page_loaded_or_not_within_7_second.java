package qsp;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Check_whether_actiTIME_page_loaded_or_not_within_7_second {
	
	static {
		
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	     
	       }


	public static void main(String[] args) {

           WebDriver driver = new OperaDriver();
           
           driver.manage().timeouts().pageLoadTimeout(14, TimeUnit.SECONDS);
           
           try {
        	   
        	   driver.get("https://demo.actitime.com/");
        	   
        	   System.out.println("page is loaded with 7 seconds");
        	   
           }
           
           catch(org.openqa.selenium.TimeoutException e)
           {
        	   
        	   System.out.println("page is not loaded with 7 seconds");
        	   
           }

	}

}
