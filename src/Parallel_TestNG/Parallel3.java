package Parallel_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
@Test
public void TC() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sky\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
}
}