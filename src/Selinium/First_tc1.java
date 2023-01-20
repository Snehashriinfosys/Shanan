package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_tc1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	//test data
	String expT= "Google";
	
	String actT=driver.getTitle();
	
	if(expT.equals(actT)) {
	System.out.println("Test case is pass");	
	}
	else {
		System.out.println("Test case is fail");
	}
	
	
}
}
