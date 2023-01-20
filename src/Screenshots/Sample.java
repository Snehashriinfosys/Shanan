package Screenshots;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Sample {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	//typecast takeshreenshot interface
	
	TakesScreenshot ts=  (TakesScreenshot)driver;
	
	//take scrrenshot using getsceenshot method
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	//create the object of file cclass
	
	 File dest = new File("C:\\Users\\sky\\Desktop\\Screenshot\\amazon.png");
	 
	 //we  need convert screenshot from src to destination  
	 
	 Files.copy(src, dest);
	
	
	
	
	
	
	
}
}
