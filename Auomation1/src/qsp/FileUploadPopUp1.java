package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FileUploadPopUp1 {

	static {
		
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	      System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	
	// WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.naukri.com/");
	 
	 driver.findElement(By.xpath("//div[.='Login']")).click();
	  
	 String pwh = driver.getWindowHandle();
	 
	 Set<String> allwh = driver.getWindowHandles();
	 
	 for(String wh:allwh)
	 {
		 
		 driver.switchTo().window(wh);
		 
		 if(!wh.equals(pwh))
		 {
			 
			 
			 driver.close();
			 
			 
		 }
		 
	 }
	 
	 driver.switchTo().window(pwh);
	 
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("joymukherjee932@gmail.com");;
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("naukri@123");
	 driver.findElement(By.xpath("//button[.='Login']")).click();
	 
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
	 
	 Thread.sleep(5000);
	 
	 File f = new File("./data/Resume.pdf");     
	 
	   //   driver.findElement(By.xpath("(//button)[2]")).click();
	      
	      String path = f.getAbsolutePath();
	      
	      driver.findElement(By.id("attachCV")).sendKeys(path);
	 
	 
	 
	 
}
}