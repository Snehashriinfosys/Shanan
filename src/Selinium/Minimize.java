package Selinium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//maximize
	driver.manage().window().maximize();
	
	//java wait
	Thread.sleep(10000);
	
	//minimize
	driver.manage().window().minimize();
	
}
}
