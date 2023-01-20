package Multibrowser_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Multibrowser {
@Parameters("browsername")
@Test
public void TC1(String browsername) throws Throwable {
	WebDriver driver =null;
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("https://www.facebook.com/");
		 
		 
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sky\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		
	}
	
	
}

}
