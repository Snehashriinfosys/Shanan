package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	
	Robot f= new Robot();
	
	Thread.sleep(3000);
	
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	f.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
Thread.sleep(3000);
	
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	f.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
Thread.sleep(3000);
	
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	f.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	
	Thread.sleep(3000);
	f.keyPress(KeyEvent.VK_PAGE_UP);
	f.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(3000);
	f.keyPress(KeyEvent.VK_PAGE_UP);
	f.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
	
	
	
}
}
