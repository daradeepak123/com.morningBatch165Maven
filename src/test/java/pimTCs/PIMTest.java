package pimTCs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PIMPage;
import testNGbasics.BaseTestNGAnnotations;


public class PIMTest extends BaseTestNGAnnotations{

	
	@BeforeMethod
	public void beforeMethod()
	{
		pim.clickPIMTab();
	}
	
	
	@Test
	public void addUser() throws Exception
	{
		pim.addUser();
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "addUser")
	public void searchUser() throws Exception
	{
		pim.searchData();
		Thread.sleep(2000);		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		pim.clickPIMTab();		
	}

	
	
}
