package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	
@Test
public void TC1() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Reporter.log("Hi Test case is pass",true);
	}

@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	Reporter.log("Hello pass the message",true);	
}

@Test
public void TC3() {
Reporter.log("it is fail");
Assert.fail();

}

@Test
public void TC() {
	Reporter.log("Successfully fail");
	Assert.fail();
	
}
}
