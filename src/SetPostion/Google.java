package SetPostion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	// enter username
	
	driver.findElement(By.id("username")).sendKeys("admin");
	
	//user password
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	//click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	//driver.getTitle();
	System.out.println(driver.getTitle());
	//expected title
	String expT="actiTIME - Login";
	String actT= driver.getTitle();
	
	if(expT.equals(actT)) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is fail");
	}
	
	
}
}
