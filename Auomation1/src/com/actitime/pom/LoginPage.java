package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement untbx;
    
    @FindBy(name = "pwd")
    private WebElement pwtbx;
    
    @FindBy(xpath = "//div[.='Login ']")
    private WebElement lgBtn;
    
    @FindBy(xpath = "//a[@class='logout']")
    private WebElement lgoutBtn;
    
 /*   public LoginPage(WebDriver driver)
    {
    	
    	PageFactory.initElements(driver, this);
    	
    } */
    
    // Business Logic method
    
    public void setLogin(String un,String psw) throws InterruptedException
    {
    	
    	untbx.sendKeys(un); // utilization
    	pwtbx.sendKeys(psw);
    	lgBtn.click();
    	Thread.sleep(5000); 
    	lgoutBtn.click();
    }
    
    
	
}
