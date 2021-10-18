package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignment_Of_Gender_Radio_Button {


	static {
		
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://en-gb.facebook.com/r.php");  //
	         
             Point p1 = driver.findElement(By.xpath("//label[text()='Female']")).getLocation();
             Point p2 = driver.findElement(By.xpath("//label[text()='Male']")).getLocation();
             Point p3 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation();
	         
	         int y1 = p1.getY();
	         int y2 = p2.getY();
	         int y3 = p3.getY();
	         
	       //  System.out.println(x1+" "+x2);
	         
	         if(y1==y2 && y2==y3)
	        	 
	        	 System.out.println("Gender Radio button are aligned properly");
	         
	         else
	        	 
	        	 System.out.println("not aligned prperly");


}
}
