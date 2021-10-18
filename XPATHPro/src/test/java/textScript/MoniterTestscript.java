package textScript;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.demoua.genericUtils.BaseClass;

import junit.framework.Assert;

//@Listeners(com.crm.demoua.genericUtils.ListnerImpl.class)
public class MoniterTestscript extends BaseClass{

	@Test
	public void ab() {
	 Assert.assertEquals(true,true);
	
} 
	
	@Test
	public void ac() {
	 Assert.assertEquals(true,true);
	
} 
	
	@Test
	public void ad() {
	 Assert.assertEquals("A","B");
	
} 
}
