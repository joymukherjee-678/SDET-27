package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CloseAllChildBrowser_Using_getTitle_method {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	}

	public static void main(String[] args) {

		// WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		
		String pwh = driver.getWindowHandle();
		
		driver.switchTo().window(pwh);
		
		String pwt = driver.getTitle();
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			
			if(!title.equals(pwt))
			{
			  
		      	driver.close();
			}
		}
		
		
	}
}