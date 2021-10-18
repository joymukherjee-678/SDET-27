package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_whether_ListBox_is_multi_selected_or_not {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
	    
	    WebElement mtr = driver.findElement(By.id("mtr"));
	    
	    Select s = new Select(mtr);
	    
	    s.selectByIndex(0);
	    s.selectByValue("d");
	    s.selectByVisibleText("vada");
	    
	    if(s.isMultiple() == true)
	    {
	    	
	    	s.deselectByIndex(2);
	    	s.deselectByValue("i");
	    	s.deselectByVisibleText("dosa");
	    	
	    }
	    
	   // s.deselectByIndex(4);
	    s.selectByValue("p");

}
	
}
