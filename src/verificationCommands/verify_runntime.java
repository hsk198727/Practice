package verificationCommands;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verify_runntime
{
	@Test	
	public void test1()
	{
		Assert.assertEquals(12, 13);
	}
}
