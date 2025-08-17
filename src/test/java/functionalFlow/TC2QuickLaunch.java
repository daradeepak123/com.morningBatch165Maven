package functionalFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BusinessMethod;
import utils.DataHelpers;
import utils.OpenBrowser;

public class TC2QuickLaunch extends OpenBrowser{

	public static void main(String[] args) throws Exception {
		url=DataHelpers.readDataPropFile("url");;
		openDesiredBrowser(url);
		
		BusinessMethod.login(driver, DataHelpers.readDataPropFile("uname"), DataHelpers.readDataPropFile("pwd"));
		WebElement qLinkTxt=driver.findElement(By.xpath("//p[text()='Quick Launch']"));
		if(qLinkTxt.getText().contains("Quick Launch"))
		{
			System.out.println("Quick Launch is visible");
		}
		else
		{
			System.out.println("Quick Launch is not visible");
		}
		
		
		quitDriver();

	}

}
