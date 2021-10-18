package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_SeliniumHQ_org_To_Selinium_Dev {

	static {
		
	      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	
  }


   public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.seleniumhq.org");
	  
      String url = driver.getCurrentUrl();
	  
	  System.out.println(url);
	  
	  if(url.contains("selenium.dev"))
	  {
		  
		   System.out.println("Url is containing selenium.dev so pass");
		  
	  }
	  
	  else {
		  
		  System.out.println("Url is not containing selenium.dev so pass");
		  
	  }

}
   
}
