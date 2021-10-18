package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {

static {
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/");  //
	         
             String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
             
             String font_type = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
             
             String font_size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
	         
	         System.out.println(color+" "+font_type+" "+font_size);

}
}