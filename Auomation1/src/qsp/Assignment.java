package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Assignment {

static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		driver.findElement(By.name("q")).sendKeys("i phone 12 pro max"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> allPhones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro Max')]"));
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro Max/../../div[2]/div[1]/div/div[1]')]"));
		
		for(int i=0;i<allPhones.size();i++)
		{
			
			String text = allPhones.get(i).getText();
			String price = allPrices.get(i).getText();
			
			System.out.println(text+"---->"+price);
			
		}

}
}
