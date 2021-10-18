package com.crm.demoua.genericUtils;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver staticDriver;

/*static {
		
		System.setProperty("webdriver.gecko.driver", DriverPathConstant.FIREFOX_DRIVER_PATH);  
		System.setProperty("webdriver.chrome.driver", DriverPathConstant.CHROME_DRIVER_PATH);
		System.setProperty("webdriver.opera.driver", DriverPathConstant.OPERA_DRIVER_PATH);
		
		
	} */
	
	// public ExcelUtility elib = new ExcelUtility();
	 FileUtility flib = new FileUtility();
//	 public JavaUtility jlib = new JavaUtility();
	 public WebDriverUtility wLib = new WebDriverUtility();
	 public  WebDriver driver;
	 
	 public String BROWSER;
	 public String USERNAME;
	 public String PASSWORD;
	 
	 @BeforeSuite(groups= {"smokeTest","regressionTest"})
	 public void connectDB()
	 {
		 
	 }
	 
	 @Parameters(value = {"browser"})
	 @BeforeClass(groups= {"smokeTest","regressionTest"})
	 public void launchBrowser(@Optional("chrome") String browserValue) throws IOException, ParseException
	 {
		//read data from property file
		 //BROWSER = flib.getDataFromJson("browser");
		 String URL =     flib.getDataFromJson("url");
		 
		 if(browserValue.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  staticDriver = new ChromeDriver();
		 }
		 else if(browserValue.equalsIgnoreCase("firefox"))
			 driver = new FirefoxDriver();
		 
		 else if(browserValue.equalsIgnoreCase("ie")) 
			   driver = new InternetExplorerDriver();
		   
		 else 
			System.out.println("invalid browser name");
		
		 System.out.println("---------browser launch successfull---------");
		 
		 wLib.maximiseWindow(staticDriver);
		 wLib.waitUntilPageLoad(staticDriver);
		 staticDriver.get(URL);
	 }
	 
 /* @BeforeMethod(groups= {"smokeTest","regressionTest"})
	 public void loginToApp() throws IOException, ParseException {
		 //read data from json file
		 USERNAME = flib.getDataFromJson("username");
		 PASSWORD = flib.getDataFromJson("password");
		 
		 //login to app
		// Login l = new Login(driver);
//		 l.login(USERNAME, PASSWORD);
		 System.out.println("-----------login successful-----------");
	 }
	 
	 @AfterMethod(groups= {"smokeTest","regressionTest"})
	 public void logoutOfApp() {
		 //sign out of home page
		// HomePage hp = new HomePage(driver);
		// hp.logout(driver).click();
	 } */
	 
	 @AfterClass(groups= {"smokeTest","regressionTest"})
	 //close the browser
	 public void closeBrowser() {
		 staticDriver.close();
	 }
	 
	 @AfterSuite(groups= {"smokeTest","regressionTest"})
	 public void closeDB() {
		 //dLib.closeDB();
		 System.out.println("----------DB connection closed successfully--------");
	 }
	
}
