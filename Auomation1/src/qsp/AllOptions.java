package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
	    
	    WebElement mtr = driver.findElement(By.id("mtr"));
	    
	    Select s = new Select(mtr);
	    
	    List<WebElement> allLinks = s.getOptions();
	    
	    int count = allLinks.size();
	    
	    for(int i=count-1;i>=0;i--)
	    {
	    	
	    	System.out.println(allLinks.get(i).getText());
	    	
	    }
	    
	    driver.close();
	    

}
	
}
