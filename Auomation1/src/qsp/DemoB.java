package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DemoB {
	
	static {
		
		     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	}

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
		  
		  DemoA.testA(driver);
		  
		  WebDriver driver1 = new FirefoxDriver();
		  
		  DemoA.testA(driver1);
		  
	      WebDriver driver2 = new OperaDriver();
		  
		  DemoA.testA(driver2);

	}

}
