package qsp;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DataDrivenTesting {

static {
		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		
	}
	

	public static void main(String[] args) throws InterruptedException{
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("https://demo.actitime.com/");
		al.add("admin");
		al.add("manager");
		System.out.println(al.get(2));
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("username", "admin");
		map.put("email", "admin@actitime.comn");
		map.put("password", "manager");
		
		System.out.println(map.get("password"));
}
	
}
