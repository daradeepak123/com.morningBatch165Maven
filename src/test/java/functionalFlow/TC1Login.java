package functionalFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BusinessMethod;
import utils.DataHelpers;
import utils.OpenBrowser;

public class TC1Login extends OpenBrowser{

	public static void main(String[] args) throws Exception {
		url=DataHelpers.readDataPropFile("url");;
		openDesiredBrowser(url);
		
		BusinessMethod.login(driver, DataHelpers.readDataPropFile("uname"), DataHelpers.readDataPropFile("pwd"));
		
		
		quitDriver();

	}

}
