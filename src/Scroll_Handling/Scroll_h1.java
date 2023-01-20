package Scroll_Handling;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_h1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sky\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.amazon.com/");

	
Thread.sleep(4000);

JavascriptExecutor jse= (JavascriptExecutor)driver;

//scrolldown
jse.executeScript("window.scrollBy(0,5000);");

//scrollup
jse.executeScript("window.scrollBy(0,-3000);");
	

}
}
