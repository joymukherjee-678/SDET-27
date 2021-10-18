package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Handling_Disabled_Element {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new OperaDriver();
		
		driver.get("file:///C:/Users/user/OneDrive/Desktop/eclipse/Disabled_html_Element.htm");
		
		driver.findElement(By.id("t1")).sendKeys("admin");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("document.getElementById('t2').value='manager'");
	
}
}
