package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
	    
	    WebElement mtr = driver.findElement(By.id("sev"));
	    
	    Select s = new Select(mtr);
	    
	    List<WebElement> allLinks = s.getAllSelectedOptions();
	    
	    int count = allLinks.size();
	    
	    for(int i=0;i<count;i++)
	    {
	    	
	    	System.out.println(allLinks.get(i).getText());
	    	
	    }
	    
	    driver.close();
	    

}
	
}
