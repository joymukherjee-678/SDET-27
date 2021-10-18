package textScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.crm.demoua.genericUtils.BaseClass;
import com.crm.demoua.genericUtils.WebDriverUtility;

import POMPakge.Tools;
//import POMPakge.Tools;

public class SvgIconXpath extends BaseClass{

	
	
    @Test
    public void hiddenElement() throws InterruptedException {
    	
       Tools tt = new Tools(driver);  
       tt.getOlympicSymbol();
       
       
    	
    }
	
}
