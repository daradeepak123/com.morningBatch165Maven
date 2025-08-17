package testNGbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotationDetailed {
	
	@Test(priority=1,description = "this test for validating login")
	public void hello4()
	{
		System.out.println("hello method4");
		Assert.assertEquals(false, false);
	}
	
	
	
	@Test(priority=4,invocationCount = 5)
	public void hello()
	{
		System.out.println("hello method");
	}
	

	@Test(priority=2,dependsOnMethods = "hello4")
	public void hello1()
	{
		System.out.println("hello method1");
	}
	

	@Test(priority=3)
	public void hello2()
	{
		System.out.println("hello method2");
	}
	

	@Test
	public void hello3()
	{
		System.out.println("hello method3");
	}
	

	
	
	
	

}
