package Particular_sshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebook {
	public static void main (String[] args) throws Throwable{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//take the xpath of an element
		WebElement abc = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")); 

		//use getscreenshot method
		File src =  abc.getScreenshotAs(OutputType.FILE);

		//create object of file class
		File dest = new File("C:\\Users\\sky\\Desktop\\Screenshot\\facebook.jpg");

		//use copy method
		Files.copy(src,dest);
}
}