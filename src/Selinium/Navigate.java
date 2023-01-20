package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	//backword
	
	driver.navigate().back();
	//forward
	driver.navigate().forward();
	//refresh the browser
	driver.navigate().refresh();
	
	
	
	
}
}
