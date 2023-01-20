package Keys_class;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver reena = new ChromeDriver();
	reena.get("https://demo.actitime.com/login.do");
	
	//implicite waite
	
	reena.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//open application using Keys class
	
	reena.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
