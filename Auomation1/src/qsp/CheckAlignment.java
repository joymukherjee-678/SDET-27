package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignment {

	static {
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://demo.actitime.com/");  //
	         
             Point p1 = driver.findElement(By.name("username")).getLocation();
             Point p2 = driver.findElement(By.name("pwd")).getLocation();
	         
	         int x1 = p1.getX();
	         int x2 = p2.getX();
	         
	       //  System.out.println(x1+" "+x2);
	         
	         if(x1==x2)
	        	 
	        	 System.out.println("Both UserName and Password textfiled are aligned properly");
	         
	         else
	        	 
	        	 System.out.println("not aligned prperly");
	         
}

}
