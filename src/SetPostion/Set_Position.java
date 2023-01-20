package SetPostion;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//create object of point class
	Point p = new Point(300,400);
	
	//use the stesize method
	driver.manage().window().setPosition(p);
}
}
