package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutGet {

	static {
		
		      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		     
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.google.com/");
		  driver.navigate().to("https://www.gmail.com/");
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  driver.close();
		  

	}

}
