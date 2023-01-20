package Multibrowser_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_browser {
	@Parameters("browsername")
	@Test
	public void TC( String browsername) throws Throwable {//parameterized method
		
		//declare global variable
		WebDriver driver=null; //runtime polymorphyzm
		
		//apply if else condition
		if(browsername.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(3000);
		driver=new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox")) { 
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sky\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			Thread.sleep(3000);
			 driver=new FirefoxDriver();
		
		}
		driver.get("https://www.amazon.com/");
	
		

}
}
