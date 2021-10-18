package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BBC_News {

static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bbc.com/");
		
		driver.findElement(By.name("q")).sendKeys("latest news");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'BBC News')]"));
		
		int count = allLink.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			
			WebElement link = allLink.get(i);
			
			String text = link.getText();
			
			System.out.println(text);
			
		}
		
		

}

}
