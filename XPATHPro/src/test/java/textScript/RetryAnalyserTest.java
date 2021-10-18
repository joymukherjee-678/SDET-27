package textScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.demoua.genericUtils.BaseClass;

//@Listeners(com.crm.demoua.genericUtils.ListnerImpl.class)
public class RetryAnalyserTest extends BaseClass{

	/*@Test
	public void ab() {
	 Assert.assertEquals(true,false);
	
} 
	
	@Test
	public void ac() {
	 Assert.assertEquals(true,true); 
	
} */
	
	@Test(retryAnalyzer=com.crm.demoua.genericUtils.ReTryImpclass.class)
	public void ad() {
	 AssertJUnit.assertEquals("A","B");
	
} 
}
