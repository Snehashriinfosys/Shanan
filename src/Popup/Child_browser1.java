package Popup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	//click on cancel btn
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(5000);
	//search mwashing machin 
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("washing machin under 15000",Keys.ENTER);
	
	Thread.sleep(5000);
	//click on 1st washing machin
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
	//switch control 
	Thread.sleep(5000);
	Set<String> allwindows = driver.getWindowHandles();
	
	//create object of arraylist
	ArrayList<String> al= new ArrayList<String>(allwindows);
	//print main windowid
	String mainid = al.get(0);
	System.out.println(mainid);
	
	//switch to clild window
	driver.switchTo().window(al.get(1));
	
	//print session id
	String cwind = al.get(1);
	
	Thread.sleep(5000);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	
	
	
	
	
	
}
}
