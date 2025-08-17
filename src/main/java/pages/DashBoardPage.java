package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver cdriver;
	public DashBoardPage(WebDriver driver)
	{
		cdriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement header;
	
	
	public void validateHeader()
	{
		String headerText=header.getText();
		Assert.assertEquals(headerText, "Dashboard");
	}
	

}
