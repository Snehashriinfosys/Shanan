package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	//click on cancel btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//search any mobile
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
	
	Thread.sleep(4000);
	//click on 1st phone
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
	Thread.sleep(4000);
	//switch the control
	Set<String> allwindows = driver.getWindowHandles();
	
	//create object of array
	ArrayList<String> al = new ArrayList<String>(allwindows);
	
	//print main window id
	String mainid = al.get(0);
	System.out.println(mainid);
	
	
	
	
}
}
