package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion_for_qspiders {

	
	
static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new OperaDriver();
		//WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(5000);
		
		//driver.get("https://www.opera.com");
		
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java");
		
	//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		
		int count = allLink.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			
			WebElement link = allLink.get(i);
			
			String text = link.getText();
			
			System.out.println(text);
			
		}
		
		String text = allLink.get(0).getText();
		
		System.out.println(text); 

}
}
