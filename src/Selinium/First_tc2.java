package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_tc2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.getTitle();
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	
	
	String title=driver.getTitle();
	System.out.println(title);
	String expT = "Google";
	String actT =  driver.getTitle();
	
	if(expT.equals(actT)) {
		System.out.println("test case is pass");
	}
	
	else {
		System.out.println("test case is fail");
	}
	driver.close();
	
	
}
}
