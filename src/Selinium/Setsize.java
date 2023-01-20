package Selinium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.foundit.in/");
	
	//Crate object of Dimention class
	
	Dimension d = new Dimension(200,100);
	
	//use the setsize method
	
	driver.manage().window().setSize(d);
}
}
