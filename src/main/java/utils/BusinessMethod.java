package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BusinessMethod {
	
	public static void login(WebDriver driver, String username,String password) throws Exception
	{
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement lgnBtn=driver.findElement(By.xpath("//button"));
		
		SeleniumHelpers.sendDataTB(driver, uname, username);
		SeleniumHelpers.sendDataTB(driver, pwd, password);
		SeleniumHelpers.clickElement(driver, lgnBtn);
		
		WebElement dbText=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		
		Assert.assertEquals(dbText.getText(), "Dashboard");
		
	}
	
	public static void logOut(WebDriver driver)
	{
		SeleniumHelpers.clickElement(driver, driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")));
		SeleniumHelpers.clickElement(driver,driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")));
	}

}
