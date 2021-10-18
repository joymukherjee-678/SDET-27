package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class AutoSuggestion_for_wipro_Jobs {

static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.opera.com/");
		
		driver.findElement(By.id("input")).sendKeys("wipro jobs"+Keys.ENTER);
		//driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
		
		List<WebElement> allLink = driver.findElements(By.xpath("//a[@href]"));
		
		int count = allLink.size();
		
		System.out.println(count);
		
	/*	for(int i=0;i<count;i++)
		{
			
			WebElement link = allLink.get(i);
			
			String text = link.getAttribute("href");
			
			System.out.println(text);
			
		} */
		
		for(WebElement link:allLink)
		{
			
			String text = link.getAttribute("href");
			
		}
		
		//String text = allLink.get(0).getText();
		
		//System.out.println(text);
		

}

}
