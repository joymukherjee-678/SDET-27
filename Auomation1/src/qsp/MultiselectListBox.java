package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectListBox {

static {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		//WebDriver driver = new OperaDriver();
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Hotel.html");
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s = new Select(mtrListBox);
		
		s.selectByIndex(0);
	/*	s.selectByVisibleText("vada");
		s.selectByValue("d");
		//s.deselectByIndex(2);
		s.selectByValue("i");
	    s.deselectByVisibleText("dosa");
	    s.deselectAll(); */
	    System.out.println(s.isMultiple());
		
}
}
