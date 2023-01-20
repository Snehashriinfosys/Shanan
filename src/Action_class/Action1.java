package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sky\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//choose target element
	WebElement target = driver.findElement(By.xpath("//a[text()='Images']"));
	
	//create object of actions
	Actions act= new Actions(driver);
	
	//movetoelement method
	act.moveToElement(target).perform();
	
	//right click sathi
	act.contextClick(target).perform();
	
}
}
