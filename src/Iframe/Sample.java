package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	//implicite wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	//switch to 1st iframe
	driver.switchTo().frame("packageListFrame");
	String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);
	
	//swith fro  1st frame to main webpage
	driver.switchTo().defaultContent();
	//2nd frame
	
	driver.switchTo().frame("packageListFrame");
	String t2 = driver.findElement(By.xpath("//a[text()='FindAll']")).getText();
	System.out.println(t2);
	
}
}
