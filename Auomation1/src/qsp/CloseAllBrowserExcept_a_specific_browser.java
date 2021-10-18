package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CloseAllBrowserExcept_a_specific_browser {

	static {

		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the title of which yoy don't want to close");
		
		Scanner sc = new Scanner(System.in);
		
		String ExpectedTitle = sc.nextLine();

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com/");
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String Actualtitle = driver.getTitle();
			
			if(!Actualtitle.equals(ExpectedTitle))
			{
			  
		      	driver.close();
			}
		}
		
		
	}
}