package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AuthenticationPop1 {

static {
		
	    // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      //System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	
	// WebDriver driver = new FirefoxDriver();
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	    Thread.sleep(6000);
	    driver.findElement(By.id("wdgt-file-upload")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("wdgt-file-upload")).sendKeys("E:\\EclipseJavaProgram\\Auomation1\\data\\Resume.pdf");

}
}
