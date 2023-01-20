package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	//maximize the Browser
	driver.manage().window().maximize();
	
	//close the Browser
	driver.close();
	
	driver.get("https://www.facebook.com/");
	
	Options opt = driver.manage();
	Window win = opt.window();
	win.maximize();
}
}
