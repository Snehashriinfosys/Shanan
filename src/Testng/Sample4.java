package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {

	@Test
	public void TC1() {
	Reporter.log("First TC is fail",true);
	Assert.fail();
}
	
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("successfully fail",true);
		Assert.fail();
	}
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("Successfully pass",true);
		
	}
	
}
