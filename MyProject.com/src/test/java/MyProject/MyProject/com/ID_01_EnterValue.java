package MyProject.MyProject.com;

import org.testng.annotations.Test;

import base.Base;

public class ID_01_EnterValue extends Base {

	
	@Test
	public void testID_01_EnterValue()
	{
		homePage h= new homePage(driver);
		h.Entertext("Ankit jain");
	}
}
