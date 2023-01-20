package Scroll_Handling;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_h {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();
	
	d.get("https://www.amazon.com/");
	
	d.manage().window().maximize();
	JavascriptExecutor jse=(JavascriptExecutor)d;
	
	//scroll down
	jse.executeScript("window.scrollBy(0,8000);");
	
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-1000);");
	
	
	
	d.close();
	
	
	
	
	
}
}
