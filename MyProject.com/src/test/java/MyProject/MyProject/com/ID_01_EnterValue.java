package MyProject.MyProject.com;

import org.testng.annotations.Test;

import base.Base;

public class ID_01_EnterValue extends Base {

	
	@Test
	public void testID_01_EnterValue() throws InterruptedException
	{
		loginPage lp = new loginPage(driver);
		lp.Login("mercury", "mercury");
		homePage h= new homePage(driver);
		
		Thread.sleep(2000);
		
		
	}
}
