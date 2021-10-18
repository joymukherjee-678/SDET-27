package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CloseAllBrowsersExceptParentBrowser {

	static {

		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	}

	public static void main(String[] args) {

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com/");
		
		String pwh = driver.getWindowHandle();
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			if(!wh.equals(pwh))
			{
			driver.switchTo().window(wh);
			driver.close();
			}
		}
		
		
	}
}