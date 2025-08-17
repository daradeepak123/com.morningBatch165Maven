package testNGbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestNG {
	
	@Test
	public void testLEarn()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("The Internet", title);
		driver.quit();
	}
	
	@Test
	public void testLEarn1()
	{
		System.out.println("THis is testNG method");
	}
	
}
