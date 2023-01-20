package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize1 {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	//maximize
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//minimaze
	driver.manage().window().minimize();
	
	
}
}
