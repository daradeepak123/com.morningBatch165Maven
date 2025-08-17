package testNGbasics;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTest {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
				driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/");
				Thread.sleep(5000);
				driver.quit();
				
				Random r=new Random();
				System.out.println(r.nextInt());
				
				
	}

}
