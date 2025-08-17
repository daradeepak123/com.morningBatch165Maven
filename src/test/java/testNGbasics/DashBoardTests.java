package testNGbasics;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoardTests extends BaseTestNGAnnotations {
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}
	
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
	}
	
	@Test
	public void test2()
	{

		driver.findElement(By.xpath("//button[@title='Leave List']")).click();
	}
	
	
	@AfterMethod
	public void afterMethod()
	{

		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}
	
	
	
	
	

}
