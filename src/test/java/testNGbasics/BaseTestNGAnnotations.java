package testNGbasics;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import pages.PIMPage;
import utils.BusinessMethod;
import utils.DataHelpers;
import utils.OpenBrowser;
import utils.SeleniumHelpers;

public class BaseTestNGAnnotations extends OpenBrowser{

	public static Properties pro;
	public static PIMPage pim;
	public static LoginPage lp;
	@BeforeSuite
	public void suitStart() throws Exception
	{

		pro=DataHelpers.retPropFile("/src/test/resources/config.properties");
	}

	@BeforeTest
	public void beforeTest() throws Exception
	{
		url=DataHelpers.readDataPropFile("url");
		openDesiredBrowser(url);
		pim=new PIMPage(driver);
		lp=new LoginPage(driver);
	}

	@BeforeClass
	public void beforeClass() throws Exception
	{

		lp.login();
		//BusinessMethod.login(driver, DataHelpers.readDataPropFile("uname"), DataHelpers.readDataPropFile("pwd"));
	}



	@AfterClass
	public void afterClass()
	{
		BusinessMethod.logOut(driver);
	}


	@AfterTest
	public void afterTest()
	{
		quitDriver();
	}



	@AfterSuite
	public void suitEnd()
	{
		pro.clear();
	}



}
