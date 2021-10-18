package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {

	@Test
	public void createCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("createCustomer",true);
		
	}
	
	@Test
	public void modifyCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("modifyCustomer",true);
		
	}
	
	@Test(dependsOnMethods= {"modifyCustomer","createCustomer",})
	public void deleteCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("deleteCustomer",true);
		
	}
	
}
