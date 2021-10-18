package textScript;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.crm.demoua.genericUtils.BaseClass;
;
public class SampleTest extends BaseClass{

	@Test
	public void scrnsht(Method mtd) {
	String currentMtdName = mtd.getName();
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
}
	
}
