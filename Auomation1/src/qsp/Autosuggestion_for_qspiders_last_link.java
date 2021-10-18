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

public class Autosuggestion_for_qspiders_last_link {

	
	
static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		//WebDriver driver = new ChromeDriver();
	    WebDriver driver = new OperaDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.opera.com");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("qspider");
		
        List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		
		String text = allLink.get(allLink.size()-1).getText();
		
		System.out.println(text); 

}
}
