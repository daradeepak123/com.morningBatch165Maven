package functionalFlow;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BusinessMethod;
import utils.DataHelpers;
import utils.ExcelUtils;
import utils.OpenBrowser;

public class TC2QuickLaunchTextFields extends OpenBrowser{

	public static void main(String[] args) throws Exception {
		
		List<String> data=ExcelUtils.readExcelDataSingleCol(System.getProperty("user.dir")+"/src/test/resources/employee.xlsx", "sheet4");
		
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
		
		List<WebElement> textFields=driver.findElements(By.xpath("//p[text()='Quick Launch']/../../../div[2]//p"));
		String webData="";
		for(WebElement ele:textFields)
		{
			System.out.println(ele.getText());
			webData=ele.getText();
			if(data.contains(webData))
			{
				System.out.println(webData+" contains in the excel");
			}
			else
			{
				System.out.println(webData+" does not contains in the excel");
			}
			
		}
		System.out.println("-------------");
		for(String d:data)
		{
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		quitDriver();

	}

}
