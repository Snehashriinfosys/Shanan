package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyclass2 {
public static void main(String[] args) {
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver sneha = new ChromeDriver();
	sneha.get("https://demo.actitime.com/login.do");
	
	//open application using keys class
	
	sneha.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
