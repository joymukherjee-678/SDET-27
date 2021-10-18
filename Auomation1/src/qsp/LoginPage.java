package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement untbx;
    
    @FindBy(id = "pwd")
    private WebElement pwtbx;
    
    @FindBy(xpath = "//div[.='Login ']")
    private WebElement lgBtn;
    
    public LoginPage(WebDriver driver)
    {
    	
    	PageFactory.initElements(driver, this);
    	
    }
    
    // Business Logic method
    
    public void setLogin(String un,String psw)
    {
    	
    	untbx.sendKeys(un); // utilization
    	pwtbx.sendKeys(psw);
    	lgBtn.click();
    	
    }
	
}
