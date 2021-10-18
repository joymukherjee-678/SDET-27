package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static {
		
		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		
		         ChromeDriver c = new ChromeDriver();
		         c.get("https://www.facebook.com/");  //
				  
				  String title = c.getTitle();
				  
				  c.findElement(By.className(""));
				  
				  System.out.println(title);
				  
				  c.close(); //  8

	}

}
