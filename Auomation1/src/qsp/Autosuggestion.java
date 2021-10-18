package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Autosuggestion {

	
	
static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opera.com/");
		
		driver.findElement(By.id("input")).sendKeys("java");
		
		List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
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
