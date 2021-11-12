package rahul.rahul;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Google extends FreeCRMTest
{
	@Test
	public void openGoogle(){
		extentTest = extent.startTest("freeCrmTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google1");
	}

}
