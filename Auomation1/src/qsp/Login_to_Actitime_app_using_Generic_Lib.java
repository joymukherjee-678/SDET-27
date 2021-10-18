package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Login_to_Actitime_app_using_Generic_Lib {
	
	static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}

public static void main(String[] args) throws IOException {
		
		FileLib1 f = new FileLib1();
		
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		
		WebDriver driver = new OperaDriver(); 
		
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
	}



	
}
