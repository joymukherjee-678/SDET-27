package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class To_Select_All_Options_and_Deselect_All_Options_in_reverse_order {

static {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
		
		
		
		//Set<String> al = new HashSet<String>();
	    
	    WebElement mtr = driver.findElement(By.id("mtr"));
	    
	    Select s = new Select(mtr);
	    
	    List<WebElement> allOptions = s.getOptions();
	    
	    for(int i=0;i<allOptions.size();i++)
	    {
	    
	    //	s.selectByValue("i");
	    	s.selectByIndex(i);
	    }
	    
	    for(int i=allOptions.size()-1;i>=0;i--)
	    {
	    
	    	//s.deselectByValue("i");
	    	s.deselectByIndex(i);
	    	
	    }
	    
	    driver.close();
	    

}
	
}
