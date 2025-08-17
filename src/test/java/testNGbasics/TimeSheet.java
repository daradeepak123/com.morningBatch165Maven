package testNGbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.SeleniumHelpers;

public class TimeSheet extends BaseTestNGAnnotations{
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.xpath("//span[text()='Time']")).click();
	}
	
	
	@Test
	public void headerTest()
	{
		WebElement header=driver.findElement(By.xpath("//h6[text()='Timesheets']"));
		SeleniumHelpers.revText(driver, header);
	}
	
	@Test
	public void sectionTest()
	{
		WebElement header=driver.findElement(By.xpath("//h6[text()='Select Employee']"));
		SeleniumHelpers.revText(driver, header);
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{

		driver.findElement(By.xpath("//span[text()='Time']")).click();
	}

}
