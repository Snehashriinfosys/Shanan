package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_tc4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.getTitle();
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	String expT ="Facebook � log in or sign up";
	String actT= driver.getTitle();
	System.out.println(driver.getTitle());
	
	
	if(expT.equals(actT)) {
		System.out.println("Test case is pass");
	}
	 
	else {
		System.out.println("Test case is fail");
	}
	
	driver.close();
	
	
	
	
}
}
