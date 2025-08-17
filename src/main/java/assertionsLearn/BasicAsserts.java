package assertionsLearn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAsserts {

	@Test
	public void assertValues()
	{
		int a=100,b=500;
		int c=a+b;
		
		Assert.assertEquals(c, 6000);
		
	}

}
