package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_All_Link_of_Amazon_site {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	    
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    
	    int count = allLinks.size();
	    
	    System.out.println(count);
	    
	    for(int i =0;i<count;i++)
	    {
	    
	    WebElement link = allLinks.get(i);
	    
	    String text = link.getText();
	    
	    System.out.println(text);
	    
	    }

}
}
