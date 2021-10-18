package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_and_Delete_All_Cookies {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
		  
		  driver.manage().deleteAllCookies();
		  
		  Thread.sleep(5000);
		  
		  driver.quit();

	}

}
