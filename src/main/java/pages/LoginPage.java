package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumHelpers;

public class LoginPage {
	
	WebDriver cdriver;
	public LoginPage(WebDriver driver)
	{
		cdriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement uNameTB;
	

	@FindBy(xpath="//input[@name='password']")
	WebElement pwdTB;
	

	@FindBy(xpath="//button")
	WebElement loginBTN;
	
	/*
	 * Author John
	 * 
	 * 
	 * */
	public void login()
	{
		SeleniumHelpers.sendDataTB(cdriver, uNameTB, "Admin");
		SeleniumHelpers.sendDataTB(cdriver, pwdTB, "admin123");
		SeleniumHelpers.clickElement(cdriver, loginBTN);
	}
	

}
