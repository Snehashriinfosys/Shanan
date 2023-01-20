package Particular_sshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class google {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	 driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
    //take the xpath of an elements 
	WebElement abc = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	
	//using getscreenshotAs() method 
	File src = abc.getScreenshotAs(OutputType.FILE);

	//create object of file class
	File dest = new File("C:\\Users\\sky\\Desktop\\Screenshot\\particular.jpg");
	
	//use copy method 
	Files.copy(src, dest);
	
	
}
}
