package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.OpenBrowser;

public class LoginDefinition extends OpenBrowser{
	
	
	@Given("User opens browser")
	public void user_opens_browser() throws Exception {
//	  driver=new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 	
		
		openDesiredBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("User loads URL")
	public void user_loads_url() {
		System.out.println("URL loaded");
	}

	@When("User enters user name and password")
	public void user_enters_user_name_and_password() {
//	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
		
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
//		driver.findElement(By.xpath("//button")).click();
		System.out.println("login action done");
	}

	@When("User validates login is succesful")
	public void user_validates_login_is_succesful() {
//	   String header=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
//	   Assert.assertEquals(header, "Dashboard");
		
		DashBoardPage dp=new DashBoardPage(driver);
		dp.validateHeader();
		
	}


	@Then("User Close the browser")
	public void closeDriver()
	{
		driver.quit();
	}
	
	@Then("Retrive Data and print")
	public void validateData()
	{
		int row=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]/td")).size();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]/td["+j+"]")).getText()+"\t");
			}
			System.out.println();
		}
		
	}
	
	

}
