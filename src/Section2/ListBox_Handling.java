package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//click on create new account btn 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//select day listbox
	Thread.sleep(3000);
	WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
	
	//create object of select class
	
	Select s= new Select(day);
	
	Thread.sleep(3000);
	
	//use select class method
	//s.selectByValue("13");
	//select visible text
	s.selectByVisibleText("13");
	
	
	
	
}
}
