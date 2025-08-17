package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelpers {
	
	
	public static WebElement findElementBy(WebDriver driver, String locatorType,String value)
	{
		WebElement ele;
		if(locatorType.equalsIgnoreCase("id"))
		{
			ele=driver.findElement(By.id(value));
		}
		else if(locatorType.equalsIgnoreCase("name"))
		{
			ele=driver.findElement(By.name(value));
		}
		else
		{
			ele=null;
		}
		
		return ele;
	}
	
	
	public static void revText(WebDriver driver,WebElement ele)
	{
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			String str=ele.getText();
			System.out.println(str);
		}
		else
		{
			System.out.println("WebElement is not enabled/displayed");
		}
	}
	
	
	public static void sendDataTB(WebDriver driver,WebElement ele,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.clear();
			ele.sendKeys(text);
		}
		else
		{
			System.out.println("WebElement is not enabled/displayed");
		}
	}
	
	
	public static void clickElement(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.click();
		}
		else
		{
			System.out.println("WebElement is not enabled/displayed");
		}
	}

}
