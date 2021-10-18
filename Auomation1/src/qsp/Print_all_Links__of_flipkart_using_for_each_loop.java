package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Print_all_Links__of_flipkart_using_for_each_loop {

static {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.in/");
	    
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    
	    int count = allLinks.size();
	    
	    System.out.println(count);
	    
	    for(WebElement e:allLinks)
	    {
	    	
	    	String text = e.getText();
	    	
	    	System.out.println(text);
	    	
	    }

}
}
