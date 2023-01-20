package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample5 {
@Test
public void TC1() {
	Reporter.log("FAilled TC",true);
	Assert.fail();
}
@Test
public void TC2() {
	Reporter.log("Hi i am 2nd TC fail",true);
	Assert.fail();
}
@Test 
public void TC3() {
	Reporter.log("This is for 3rd TC is fail",true);
	Assert.fail();
}

@Test
public void TC4() {
	Reporter.log("This is 4th TC is fail",true);
	Assert.fail();
}
@Test
public void TC5() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Reporter.log("This TC is open the google browse");
	
}
}
