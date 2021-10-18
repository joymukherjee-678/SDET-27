package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Only_duplicate_Options {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
		
		Set<String> hs = new HashSet<String>();
	    
	    WebElement mtr = driver.findElement(By.id("mtr"));
	    
	    Select s = new Select(mtr);
	    
	    List<WebElement> allLinks = s.getOptions();
	    
	    int count = allLinks.size();
	    
	    for(int i=0;i<count;i++)
	    {
	    	String text = allLinks.get(i).getText();
	    	
	    	if(hs.add(text)== false)
	        	System.out.println(text);
	    	
	    }
	    
	    driver.close();
	    

}
	
}
