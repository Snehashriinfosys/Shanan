package Inspect_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	
	
	driver.findElement(By.id("username")).sendKeys("admin ");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[text()='Login ']" )).click();
	
	String expT= "actiTIME - Login";
	String actT= driver.getTitle();
	System.out.println(driver.getTitle());
	
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
	}
	
	else {
		System.out.println("TC is fail");
	}
	
	
	
	
}
}
