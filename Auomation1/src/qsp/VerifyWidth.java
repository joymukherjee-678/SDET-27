package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWidth {


	static {
		
		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		
		         WebDriver driver = new ChromeDriver();
		         driver.get("https://demo.actitime.com/");  //
		         
		         Dimension d1 = driver.findElement(By.name("username")).getSize();
		         Dimension d2 = driver.findElement(By.name("pwd")).getSize();
		         
		         int width1 = d1.getWidth();
		         int width2 = d2.getWidth();
		         
		         if(width1==width2)
		         
		        	   	 System.out.println("UserName and Password width are same");
		         
		         else
		        	 
		        	 System.out.println("UserName and Password width are not same");
		      

}
}
