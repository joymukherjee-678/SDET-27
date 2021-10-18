package com.crm.demoua.genericUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.regexp.recompile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListnerImpl implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		String data = result.getName();
		//System.out.println(data);
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testscript got pass");
		
	}

	public void onTestFailure(ITestResult result) {
		
	//	String testName = result.getMethod().getMethodName();
	/*	EventFiringWebDriver takescreenshot=new EventFiringWebDriver(BaseClass.staticDriver);
		File source=takescreenshot.getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")
				+"//screenshot//"+result.getMethod().getMethodName()+
				"_"+JavaUtility.getCurrentDate()+".PNG";
		File dest=new File(screenshotPath);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		String testName = result.getMethod().getMethodName();
		//System.out.println(testName);
	/*	EventFiringWebDriver takescreenshot=new EventFiringWebDriver(BaseClass.staticDriver);
		File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File desc = new File(".//screenshot//"+testName+".png");
		try {
			FileUtils.copyFile(srcFile, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		String currentMtdName = result.getMethod().getMethodName();
		Date date = new Date();
		String currentDate = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(currentDate);
		EventFiringWebDriver takescreenshot=new EventFiringWebDriver(BaseClass.staticDriver);
		File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File desc = new File(".//screenshot//"+currentMtdName+"_"+currentDate+".png");
		try {
			FileUtils.copyFile(srcFile, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Testscript got failed");
		
	}  
}

/*	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}*/
