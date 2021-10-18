package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBrowser {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	
}


public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.navigate().to("https://www.google.com/");
	  driver.navigate().to("https://www.linkedin.com/");
	  driver.navigate().to("https://in.linkedin.com/");
	  driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  driver.close();
	  

}
}
