package POMPakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.crm.demoua.genericUtils.WebDriverUtility;
//import com.crm.vtiger.genericUtils.ExcelUtility;
//import com.crm.vtiger.genericUtils.LeadTitle;
//import com.crm.vtiger.genericUtils.WedDriverUtility;

public class Tools {
	//String ln,fn,com;
	String text;
	 SoftAssert s = new SoftAssert();

	WebDriverUtility wdu = new WebDriverUtility();
	//ExcelUtility eu = new ExcelUtility();
	
	@FindBy(xpath = "//div[text()='You hovered over the Button']")
	private WebElement overmsg;

	
	
	@FindBy(xpath = "//button[text() ='Hover me to see']")
	private WebElement ovrBtn;
	
	@FindBy(xpath = "//input[@id='toolTipTextField']")
	private WebElement txtfld;
	
	@FindBy(xpath = "//img[@alt='Eliud KIPCHOGE']/ancestor::li[contains(@class,'list__item position-relative')]/div[@class='featured-athlete__medals text-body-sm']/span[text()='G']")
	private WebElement getsymbl;
	
	@FindBy(xpath = "//div[contains(text(),'Rankings') and @class='global-navigation__link']/*[name()='svg']")
	private WebElement getsvg;
	
	@FindBy(xpath = "//div[contains(text(),'Rankings') and @class='global-navigation__link']")
	private WebElement rnk;
	
/*	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement srchld;
	
	@FindBy(name = "search_field")
	private WebElement srchfld;
	
	@FindBy(xpath = "//input[@value=' Search Now ']")
	private WebElement srchbtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement moveElement; */
	
	

    public Tools(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
    
    public void overButton(WebDriver driver) throws InterruptedException {
    	wdu.mouseOver(driver,ovrBtn);
    	Thread.sleep(5000);
         text = overmsg.getText();
    	 System.out.println(text);
    	 txtfld.sendKeys(text);
	}
    
    public void enterValue() throws InterruptedException
    {
    	Thread.sleep(5000);
    	System.out.println(text);
    	//txtfld.sendKeys(text);
    }
    
    public void getOlympicSymbol() {
    	
    	String sym = getsymbl.getText();
    	System.out.println(sym);
    }
    
    public void getSvgSymbol() {
    	getsvg.click();
    }
    
    public void getRanking() {
    	rnk.click();
    } 
     
 /*   public WebElement createLead1() {
    	//createlead.click();
		return createlead;
	}
    
  /*  public void searchLead(String ldn)
    {
    	srchld.sendKeys(ldn);
    } */
    
 //   public WebElement searchLead() throws InterruptedException
  //  {
//    	Thread.sleep(5000);
    //	return srchld;
    }
    
 /*   public void selectOption() throws Throwable
    {
    	wdu.SelectOption(srchfld, eu.getExcelData("Sheet1", 25, 1));
    }
    
    public void selectOption1() throws Throwable
    {
    	wdu.SelectOption(srchfld, eu.getExcelData("Sheet1", 26, 1));
    }
    
    public void selectOption2() throws Throwable
    {
    	wdu.SelectOption(srchfld, eu.getExcelData("Sheet1", 27, 1));
    }
    
    public void selectOption3() throws Throwable
    {
    	wdu.SelectOption(srchfld, eu.getExcelData("Sheet1", 28, 1));
    }
    
    public void searchNowButton()
    {
    	srchbtn.click();
    }
    
    public void searchLastName() throws Throwable
    {
    	//srchfld.sendKeys(dat1);
    	ln=eu.getExcelData("Sheet1", 8, 2);
    	srchld.sendKeys(ln);
    	
    } 
    
    public WebElement searchLastName1() throws Throwable
    {
    	//srchfld.sendKeys(dat1);
    	ln=eu.getExcelData("Sheet1", 8, 2);
    	
		return srchld;
    	
    }
    
    public void searchFirstName() throws Throwable
    {
    	//srchfld.sendKeys(dat1);
    	fn=eu.getExcelData("Sheet1", 11, 1);
    	srchld.sendKeys(fn);
    	
    }
    
    public void searchCompany() throws Throwable
    {
    	//srchfld.sendKeys(dat1);
    	com=eu.getExcelData("Sheet1", 14, 3);
    	srchld.sendKeys(com);
    	
    }
    
    
    
    public void verifyResult(WebDriver driver)
	{
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	String ExpectedTitle = LeadTitle.ExpectedTitle;
	s.assertEquals(ActualTitle, ExpectedTitle);
	s.assertAll();
	} */
	
	

	

