package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AuthenticationPop {

static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    //  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	
	// WebDriver driver = new FirefoxDriver();
	   WebDriver driver = new OperaDriver();
	  
	  driver.get("https://www.naukri.com/nlogin/login");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//input[.='Login'])")).click();
	  
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("joymukherjee932@gmail.com");
	  
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("naukri@123");
	  
	  driver.findElement(By.xpath("//div[.='UPDATE PROFILE'][2]")).click();
	  
	  Thread.sleep(4000);
	  
	  driver.findElement(By.id("attachCV")).sendKeys("C:\\\\Users\\\\user\\\\Downloads\\\\Resume.pdf");

}
}
