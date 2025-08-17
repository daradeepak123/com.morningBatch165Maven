package propFileLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.DataHelpers;
import utils.OpenBrowser;
import utils.SeleniumHelpers;

public class SeleniumReadDataProp extends OpenBrowser{

	public static void main(String[] args) throws Exception {
//		System.out.println(DataHelpers.readDataPropFile("browser"));
//		System.out.println(DataHelpers.readDataPropFile("url"));
		
		url=DataHelpers.readDataPropFile("url");
		openDesiredBrowser(url);
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement lgnBtn=driver.findElement(By.xpath("//button"));
		
		SeleniumHelpers.sendDataTB(driver, uname, DataHelpers.readDataPropFile("uname"));
		SeleniumHelpers.sendDataTB(driver, pwd, DataHelpers.readDataPropFile("pwd"));
		SeleniumHelpers.clickElement(driver, lgnBtn);
		
		
		quitDriver();

	}

}
