package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_tc {
public static void main(String[] args) throws  Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	//driver.getTitle();
	//System.out.println(driver.getTitle());
	
	Thread.sleep(2000);
	String expText="Frequently repurchased in Drugstore";
	
	String actText=driver.findElement(By.xpath("//span[.='Frequently repurchased in Drugstore']")).getText();
	
	if(actText.equals(expText)) {
		System.out.println("tc pass");
	}
	else {
		System.out.println("fail");
	}
}
}