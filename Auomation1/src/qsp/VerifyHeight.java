package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHeight {

	static {
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://www.naukri.com/");  //
	         
	         Dimension d1 = driver.findElement(By.name("keyword")).getSize();
	         Dimension d2 = driver.findElement(By.name("location")).getSize();
	         
	         int height1 = d1.getHeight();
	         int height2 = d2.getHeight();
	         
	         if(height1==height2)
		         
        	   	 System.out.println("UserName and Password height are same");
         
         else
        	 
        	 System.out.println("UserName and Password height are not same");
	         
	         
	         driver.quit();
      
	         
}
}
