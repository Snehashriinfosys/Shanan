package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();
	
	//use javascript executor interface
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	
	//scroll down
	jse.executeScript("window.scrollBy(0,8000);");
	
	Thread.sleep(4000);
	
	//scroll up
	
	jse.executeScript("window.scrollBy(0,-3000);");
	
	driver.close();
}
}
