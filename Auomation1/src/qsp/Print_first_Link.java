package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_first_Link {
    
	
static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Demo.html");
	    
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    
	    int count = allLinks.size();
	    
	    System.out.println(count);
	    
	    for(int i =0;i<count;i++)
	    {
	    
	    WebElement link = allLinks.get(i);
	    
	    String text = link.getText();
	    
	    System.out.println(text);
	    
	    }
	    
	    String text = allLinks.get(0).getText();
	    
	    System.out.println(text);

}
}

