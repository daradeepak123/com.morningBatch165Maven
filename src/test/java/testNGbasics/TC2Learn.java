package testNGbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2Learn extends BaseTestNGAnnotations{
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("this is test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("this is test4");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method");
	}
	

}
