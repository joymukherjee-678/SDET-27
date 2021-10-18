package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetXAndYAxis {

	static {
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/");  //
	         
	         Point p = driver.findElement(By.xpath("//button[@name='login']")).getLocation();
	         
	         int x = p.getX();
	         int y = p.getY();
	         
	         System.out.println("x axis = "+' '+x);
	         
	         System.out.println("y axis = "+' '+y);
	         
	        	 
	        	 
	        	 

}
}
