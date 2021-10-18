package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Gmail_Ac_Contain_Under_Google_Ac {
	
	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	
    }


     public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.gmail.com");
	  
	  String url = driver.getCurrentUrl();
	  
	  System.out.println(url);
	  
	  if(url.contains("google.com"))
	  {
		  
		   System.out.println("Url is containing google.com so pass");
		  
	  }
	  
	  else {
		  
		  System.out.println("Url is not containing google.com so fail");
		  
	  }

}

}
